package com.dnyanshree.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.dnyanshree.api.entity.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Movie> findAll() {
		TypedQuery<Movie> movie = em.createQuery("from Movie", Movie.class);
		return movie.getResultList();
	}

	@Override
	public List<Movie> findAllByType(String type) {
		TypedQuery<Movie> movie = em.createNamedQuery("Movie.findByType",Movie.class);
		movie.setParameter("mType", type);
		List<Movie> movies = movie.getResultList();
		if(movies!=null && movies.size()>0){
			return movies;
		}
		else{
			return null;
		}			
	}

	@Override
	public List<Movie> findAllByYear(int year) {
		TypedQuery<Movie> movie = em.createNamedQuery("Movie.findByYear",Movie.class);
		movie.setParameter("mYear", year);
		List<Movie> movies = movie.getResultList();
		if(movies!=null && movies.size()>0){
			return movies;
		}
		else{
			return null;
		}	
	}

	@Override
	public List<Movie> findAllByGenre(String genre) {
		TypedQuery<Movie> movie = em.createNamedQuery("Movie.findByGenre",Movie.class);
		movie.setParameter("mGenre", genre);
		List<Movie> movies = movie.getResultList();
		if(movies!=null && movies.size()>0){
			return movies;
		}
		else{
			return null;
		}	
	}

	@Override
	public List<Movie> findAllByTitleSearchText(String title) {
		TypedQuery<Movie> movie = em.createNamedQuery("Movie.findByTitle",Movie.class);
		movie.setParameter("mTitle",  "'%"+title+"%'");
		List<Movie> movies = movie.getResultList();
		if(movies!=null && movies.size()>0){
			return movies;
		}
		else{
			return null;
		}	
	}
	
	@Override
	public Movie findOne(String title) {
		return em.find(Movie.class, title);
	}

	@Override
	public Movie create(Movie movie) {
		em.persist(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		return em.merge(movie);
	}

	@Override
	public void delete(Movie movie) {
		em.remove(movie);
	}
	
}
