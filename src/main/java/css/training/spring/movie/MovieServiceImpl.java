package css.training.spring.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import css.training.spring.domain.Movie;
import css.training.spring.domain.MovieDao;

// make this class as spring service with transaction support
@Service
@Transactional
class MovieServiceImpl implements MovieService {
	// inject movie DAO
	@Autowired
	MovieDao movieDao;

	public List<Movie> findByName(String name) {
		List<Movie> list = movieDao.findByName(name);
		return list;
	}

	public String findNameById(int id) {
		String name = movieDao.getNameById(id);
		if (name == null) {
			return null;
		}
		return name.concat(String.valueOf("(" + id + ")"));
	}

	public int add(Movie m) {
		return movieDao.create(m);
	}

}
