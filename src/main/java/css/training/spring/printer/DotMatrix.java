package css.training.spring.printer;

import org.apache.log4j.Logger;

class DotMatrix implements Printer {
	public static final Logger logger = Logger.getLogger(DotMatrix.class);

	public void print() {
		logger.info("printing very slowly");
	}

}
