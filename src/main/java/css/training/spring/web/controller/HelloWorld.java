package css.training.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloWorld {
	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "helloWorld";
	}

	@RequestMapping("/hello/{name}")
	@ResponseBody
	public String sayHello(@PathVariable String name) {
		return "Hello " + name;
	}
}