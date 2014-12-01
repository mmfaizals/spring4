package css.training.spring;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import css.training.spring.domain.MovieDao;
import css.training.spring.movie.MovieContext;
import css.training.spring.movie.MovieService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Example06TestContext.class,
		MovieContext.class })
public class Example06 {

	@Autowired
	MovieService service;
	@Autowired
	MovieDao dao;
	@Autowired
	EasyMockSupport mockSupport;

	@Test
	public void testFindById() {
		mockSupport.resetAll();
		EasyMock.expect(dao.getNameById(1)).andReturn("Quest");
		mockSupport.replayAll();
		String name = service.findNameById(1);
		Assert.assertThat(name, CoreMatchers.notNullValue());
		Assert.assertThat(name, CoreMatchers.startsWith("Quest"));
	}
}
