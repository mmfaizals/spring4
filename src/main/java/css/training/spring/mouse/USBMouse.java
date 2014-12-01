package css.training.spring.mouse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

//make this class as spring component
@Component
class USBMouse implements Mouse {

	public static final Logger logger = Logger.getLogger(USBMouse.class);

	public void click() {
		logger.info("using USB mouse to click");

	}

	public void rightClick() {
		logger.info("using USB mouse to right click");

	}

}
