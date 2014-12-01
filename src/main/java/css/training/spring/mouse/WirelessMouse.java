package css.training.spring.mouse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

//make this class as spring component
@Component
class WirelessMouse implements Mouse {
	public static final Logger logger = Logger.getLogger(WirelessMouse.class);

	public void click() {
		logger.info("using wireless mouse to click");

	}

	public void rightClick() {
		logger.info("using wireless mouse to right click");

	}

}
