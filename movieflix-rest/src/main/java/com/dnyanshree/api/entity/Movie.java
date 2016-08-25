package com.dnyanshree.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries(value ={
		 @NamedQuery(name = "Movie.findByYear", query = "Select m from Movie m where m.year=:mYear"),
		 @NamedQuery(name = "Movie.findByType", query = "Select m from Movie m where m.type=:mType"),
		 @NamedQuery(name = "Movie.findByGenre", query = "Select m from Movie m where m.genre=:mGenre"),
		 @NamedQuery(name = "Movie.findByTitle", query = "Select m from Movie m where m.title LIKE :mTitle") 
})
public class Movie {
/* "Title": "Avengers: Age of Ultron",
    "Year": "2015",
    "Rated": "PG-13",
    "Released": "01 May 2015",
    "Runtime": "141 min",
    "Genre": "Action, Adventure, Sci-Fi",
    "Director": "Joss Whedon",
    "Writer": "Joss Whedon, Stan Lee (Marvel comics), Jack Kirby (Marvel comics)",
    "Actors": "Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans",
    "Plot": "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans.",
    "Language": "English",
    "Country": "USA",
    "Awards": "1 win & 12 nominations.",
    "Poster": "http://ia.media-imdb.com/images/M/MV5BMTU4MDU3NDQ5Ml5BMl5BanBnXkFtZTgwOTU5MDUxNTE@._V1_SX300.jpg",
    "Metascore": "66",
    "imdbRating": "7.6",
    "imdbVotes": "370,909",
    "imdbID": "tt2395427",
    "Type": "movie"
    */
	@Id
	private String title;
	private int year;
	private String rated;
	private String released;
	private String runtime;
	private String genre;
	private String director;
	private String writer;
	private String actors;
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String poster;
	private int metascore;
	private String imdbRating;
	private int imdbVotes;
	private String imdbID;
	private String type;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getMetascore() {
		return metascore;
	}
	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public int getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(int imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", rated=" + rated + ", released=" + released + ", runtime="
				+ runtime + ", genre=" + genre + ", director=" + director + ", writer=" + writer + ", actors=" + actors
				+ ", plot=" + plot + ", language=" + language + ", country=" + country + ", awards=" + awards
				+ ", poster=" + poster + ", metascore=" + metascore + ", imdbRating=" + imdbRating + ", imdbVotes="
				+ imdbVotes + ", imdbID=" + imdbID + ", type=" + type + "]";
	}
	
	
	
	
}
