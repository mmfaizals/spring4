package css.training.spring;

import org.easymock.EasyMockSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import css.training.spring.domain.MovieDao;

public class Example06TestContext {
	@Autowired
	EasyMockSupport mockSupport;

	@Bean
	public MovieDao movieDao() {
		return mockSupport.createMock(MovieDao.class);
	}

	@Bean
	public EasyMockSupport mockSupport() {
		return new EasyMockSupport();
	}

}
