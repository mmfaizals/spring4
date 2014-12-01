package css.training.spring.movie;

import org.springframework.context.annotation.Bean;

public class MovieContext {
	@Bean
	public MovieService movieService() {
		return new MovieServiceImpl();
	}
}
