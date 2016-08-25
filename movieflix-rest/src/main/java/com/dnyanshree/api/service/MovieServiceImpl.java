package com.dnyanshree.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dnyanshree.api.entity.Movie;
import com.dnyanshree.api.exception.MovieAlreadyExistsException;
import com.dnyanshree.api.exception.MovieNotFound;

import com.dnyanshree.api.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Override
	public List<Movie> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Movie> findAllByType(String type) {
		List<Movie> movies = repository.findAllByType(type);
		if(movies == null){
			throw new MovieNotFound("Movie with type = "+type+" not found");
		}
		return movies;
	}

	@Override
	public List<Movie> findAllByYear(int year) {
		List<Movie> movies = repository.findAllByYear(year);
		if(movies == null){
			throw new MovieNotFound("Movie with year = "+year+" not found");
		}
		return movies;
	}

	@Override
	public List<Movie> findAllByGenre(String genre) {
		List<Movie> movies = repository.findAllByGenre(genre);
		if(movies == null || movies.size()<=0){
			throw new MovieNotFound("Movie with genre = "+genre+" not found");
		}
		return movies;
	}

	@Override
	public List<Movie> findAllByTitleSearchText(String title) {
		List<Movie> movies = repository.findAllByTitleSearchText(title);
		if(movies == null){
			throw new MovieNotFound("Movie with title = "+title+" not found");
		}
		return movies;
	}
	
	@Override
	public Movie findOne(String title) {
	Movie existing = repository.findOne(title);
		if(existing == null){
			throw new MovieNotFound("Movie with title = "+title+" not found");
		}
		return existing;
	}


	@Override
	public Movie create(Movie movie) {
		//check for movie duplicacy
		Movie existing = repository.findOne(movie.getTitle());
		if(existing != null){
			throw new MovieAlreadyExistsException("Movie with title = "+movie.getTitle()+" not found");
		}
		return repository.create(movie);
	}

	@Override
	public Movie update(String title, Movie movie) {
		Movie existing = repository.findOne(title);
		if(existing == null){
			throw new MovieNotFound("Movie with title = "+title+" not found");
		}
		return repository.update(existing);
	}

	@Override
	public void delete(String title) {
		Movie existing = repository.findOne(title);
		if(existing == null){
			throw new MovieNotFound("Movie with title = "+title+" not found");
		}
		repository.delete(existing);
	}

	
}
