package css.training.spring.domain.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import css.training.spring.domain.Movie;
import css.training.spring.domain.MovieDao;

//make this impl as spring repository
@Repository
class MovieDaoImpl implements MovieDao {

	@Autowired
	NamedParameterJdbcTemplate template;

	public List<Movie> findByName(String name) {
		Movie param = new Movie();
		param.setName(name);
		BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(
				param);
		// write a row mapper to read columns movie_id,name,genre
		RowMapper<Movie> mapper = new RowMapper<Movie>() {

			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie result = new Movie();
				result.setMovieId(rs.getInt("movie_id"));
				result.setName(rs.getString("name"));
				result.setGenre(rs.getString("genre"));
				return result;
			}
		};
		return template.query("select * from movie where name=:name", source,
				mapper);
	}

	// implement this method , use below query
	// select name from movie where movie_id=:movieId
	public String getNameById(int id) {
		Movie param = new Movie();
		param.setMovieId(id);
		BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(
				param);
		return template.queryForObject(
				"select name from movie where movie_id=:movieId", source,
				String.class);
	}

	public int create(Movie m) {
		throw new UnsupportedOperationException("I am not doing this with jdbc");
	}
}
