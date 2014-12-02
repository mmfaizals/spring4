package css.training.spring.domain.jdbc;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import css.training.spring.domain.Movie;
import css.training.spring.domain.MovieDao;

//make this impl as spring repository

class MovieDaoImpl implements MovieDao {

	NamedParameterJdbcTemplate template;

	public List<Movie> findByName(String name) {
		Movie param = new Movie();
		param.setName(name);
		BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(
				param);
		// write a row mapper to read columns movie_id,name,genre
		RowMapper<Movie> mapper = null;
		return template.query("select * from movie where name=:name", source,
				mapper);
	}

	// implement this method , use below query
	// select name from movie where movie_id=:movieId
	public String getNameById(int id) {
		return null;
	}

	public int create(Movie m) {
		throw new UnsupportedOperationException("I am not doing this with jdbc");
	}
}
