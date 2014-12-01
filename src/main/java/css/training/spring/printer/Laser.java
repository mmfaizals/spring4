package css.training.spring.printer;

import org.apache.log4j.Logger;

class Laser implements Printer {

	public static final Logger logger = Logger.getLogger(Laser.class);

	public void print() {
		logger.info("i can print faster");
	}

}
