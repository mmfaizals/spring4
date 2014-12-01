package css.training.spring.movie;

import java.util.List;

import css.training.spring.domain.Movie;

public interface MovieService {
	List<Movie> findByName(String name);

	String findNameById(int id);

	int add(Movie m);
}
