package com.dnyanshree.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dnyanshree.api.entity.Movie;
import com.dnyanshree.api.service.MovieService;

@RestController//Instead of @Controller and @ResponseBody -> for putting response as json result on the page and not on html or jsp
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@RequestMapping(method =  RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAll(){		
		return service.findAll();
	}
	
	@RequestMapping(method =  RequestMethod.GET, value="type/{type}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAllByType(@PathVariable("type") String type){		
		return service.findAllByType(type);
	}
	
	@RequestMapping(method =  RequestMethod.GET, value="year/{year}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAllByYear(@PathVariable("year") int year){		
		return service.findAllByYear(year);
	}
	
	@RequestMapping(method =  RequestMethod.GET, value="genre/{genre}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAllByGenre(@PathVariable("genre") String genre){		
		return service.findAllByGenre(genre);
	}
	
	@RequestMapping(method =  RequestMethod.GET, value="title/{title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> findAllByTitleSearchText(@PathVariable("title") String movieTitle){		
		return service.findAllByTitleSearchText(movieTitle);
	}
	
	@RequestMapping(method =  RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie create(@RequestBody Movie movie){
		return service.create(movie);
	}
	
	@RequestMapping(method =  RequestMethod.PUT, value="title/{title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie update(@PathVariable("title") String movieTitle, @RequestBody Movie movie){
		return service.update(movieTitle, movie);
	}
	
	@RequestMapping(method =  RequestMethod.DELETE, value="title/{title}")
	public void delete(@PathVariable("title") String movieTitle){	
		service.delete(movieTitle);
	}
}
