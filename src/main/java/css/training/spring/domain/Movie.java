package css.training.spring.domain;

import javax.persistence.Id;

@javax.persistence.Entity
public class Movie {
	@Id
	private int movieId;
	private String name;
	private String genre;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
