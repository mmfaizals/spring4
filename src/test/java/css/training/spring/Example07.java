package css.training.spring;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import css.training.spring.domain.Movie;
import css.training.spring.movie.MovieService;

/**
 * Run this Junit using SpringJUnit4ClassRunner.
 * <p>
 * use movie-context.xml ,domain-hibernate-context.xml as configuration file
 * <p>
 * wire MovieService
 * <p>
 * find a Movie with name 'My Sassy Girl'
 * <p>
 * Assert return values
 */

public class Example07 {

	// autowire movie service

	@Test
	public void test() {
		// find list of movies with name "My Sassy Girl"
		// check the return value is not null using hamcrest CoreMatchers
	}

}
