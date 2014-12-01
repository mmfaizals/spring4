package css.training.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import css.training.spring.computer.Computer;
import css.training.spring.mouse.Mouse;
import css.training.spring.printer.Printer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:computer-context.xml" })
public class Example04 {

	@Autowired
	private Computer comp;
	@Autowired
	@Qualifier("wirelessMouse")
	private Mouse mouse;
	@Autowired
	@Qualifier("dotMtrx")
	private Printer dotMtrx;

	@Test
	public void testXML() {
		mouse.rightClick();
		dotMtrx.print();
		comp.clickMouse();
	}

}