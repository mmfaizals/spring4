package css.training.spring;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import css.training.spring.computer.Computer;

public class Example03 {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// get the context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"computer-context.xml");
		// get the Computer workstation1
		Computer c = (Computer) ctx.getBean("workstation1");
		// do a print
		c.print();
		// do a mouse click
		c.clickMouse();
		ctx.close();
	}
}
