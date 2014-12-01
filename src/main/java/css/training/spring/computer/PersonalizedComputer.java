package css.training.spring.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import css.training.spring.mouse.Mouse;
import css.training.spring.printer.Printer;

// make this as spring component
public class PersonalizedComputer implements Computer {

	@Autowired
	@Qualifier("wirelessMouse")
	private Mouse mouse;

	// wire dot matrix printer
	@Autowired
	@Qualifier("dotMtrx")
	private Printer print;

	public void clickMouse() {
		mouse.click();

	}

	public void print() {
		print.print();

	}

}
