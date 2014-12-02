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

/**
 * Run this Junit using SpringJUnit4ClassRunner.
 * <p>
 * use computer-context.xml as configuration file
 * <p>
 * wire a computer , wirelessMouse, and dot matrix printer
 * <p>
 * invoke methods on wired objects
 */

public class Example04 {

	@Test
	public void testXML() {
		// invoke methods on objects
	}

}