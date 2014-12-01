package css.training.spring.domain.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import css.training.spring.domain.Movie;
import css.training.spring.domain.MovieDao;

//make this impl as spring repository
@Repository
class MovieDaoImpl implements MovieDao {
	@Autowired
	private SessionFactory factory;

	public List<Movie> findByName(String name) {
		Session session = factory.getCurrentSession();
		Query q = session.createQuery("from Movie where name=:name");
		q.setString("name", name);
		return q.list();
	}

	public String getNameById(int id) {
		Session session = factory.getCurrentSession();
		Query q = session
				.createQuery("select name from Movie where movieId=:movieId");
		q.setInteger("movieId", id);
		return ((Movie) q.uniqueResult()).getName();
	}

	public int create(Movie m) {
		Session session = factory.getCurrentSession();
		Integer pk = (Integer) session.save(m);
		return pk;
	}

}
