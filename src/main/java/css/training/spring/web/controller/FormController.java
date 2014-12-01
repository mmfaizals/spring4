package css.training.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import css.training.spring.web.BeanParam;

@Controller
@RequestMapping("/form")
public class FormController {
	@RequestMapping("/")
	public String showForm(Model model) {
		BeanParam param = new BeanParam();
		param.setParam1("I am Param1");
		param.setParam2(100);
		model.addAttribute("beanParam", param);
		return "form";
	}

	@RequestMapping("/submit")
	public String onSubmit(@ModelAttribute("param") BeanParam param, Model model) {
		// set incoming bean param in model so it can be rendered
		model.addAttribute("beanParam", param);
		return "form";
	}
}