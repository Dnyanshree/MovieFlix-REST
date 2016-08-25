package com.dnyanshree.api.repository;

import java.util.List;
import com.dnyanshree.api.entity.Movie;

public interface MovieRepository {

	public List<Movie> findAll();
	public List<Movie> findAllByType(String type);
	public List<Movie> findAllByYear(int year);
	public List<Movie> findAllByGenre(String genre);
	public List<Movie> findAllByTitleSearchText(String title);
	public Movie findOne(String title);
	public Movie create(Movie movie);
	public Movie update(Movie movie);
	public void delete(Movie movie);
}
