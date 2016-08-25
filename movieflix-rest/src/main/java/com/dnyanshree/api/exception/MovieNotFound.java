package com.dnyanshree.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Movie Not Found")
public class MovieNotFound extends RuntimeException{
	
	public MovieNotFound(String message){
		super(message);
	}
	
	public MovieNotFound(String message, Throwable cause){
		super(message, cause);
	}
	

}
