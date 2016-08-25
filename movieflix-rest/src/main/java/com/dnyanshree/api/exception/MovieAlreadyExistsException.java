package com.dnyanshree.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code=HttpStatus.BAD_REQUEST, reason="Movie already exists")
public class MovieAlreadyExistsException extends RuntimeException {
	public MovieAlreadyExistsException(String message){
		super(message);
	}
	
	public MovieAlreadyExistsException(String message, Throwable cause){
		super(message, cause);
	}
}
