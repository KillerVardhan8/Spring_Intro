package net.suryavardhan.springbootloggingdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

	    @GetMapping("/log")
	    public String logExample() {
	        logger.trace("TRACE level log");
	        logger.debug("DEBUG level log");
	        logger.info("INFO level log");
	        logger.warn("WARN level log");
	        logger.error("ERROR level log");
	        return "Logging messages printed!";
	    }
}
