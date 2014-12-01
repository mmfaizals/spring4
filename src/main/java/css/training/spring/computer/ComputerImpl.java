package css.training.spring.computer;

import css.training.spring.mouse.Mouse;
import css.training.spring.printer.Printer;

public class ComputerImpl implements Computer {

	private Mouse mouse;

	private Printer printer;

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void clickMouse() {
		mouse.click();

	}

	public void print() {
		printer.print();
	}

}
