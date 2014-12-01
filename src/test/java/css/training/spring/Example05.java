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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:domain-jdbc-context.xml",
		"classpath:movie-context.xml" })
public class Example05 {
	// autowire movie service
	@Autowired
	MovieService service;

	@Test
	public void test() {
		// find list of movies with name "My Sassy Girl"
		List<Movie> list = service.findByName("My Sassy Girl");
		// check the return value is not null using hamcrest CoreMatchers
		Assert.assertThat(list, CoreMatchers.notNullValue());
	}

}
