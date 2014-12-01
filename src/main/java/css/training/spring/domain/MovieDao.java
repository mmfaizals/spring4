package css.training.spring.domain;

import java.util.List;

public interface MovieDao {
	List<Movie> findByName(String name);

	String getNameById(int id);

	int create(Movie m);
}
