package net.suryavardhan.springbootloggingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SpringbootLoggingDemoApplication {
	// Create the Logger instance
	private static final Logger logger = LoggerFactory.getLogger(SpringbootLoggingDemoApplication.class);

	public static void main(String[] args) {
	        // Example log statements
	        logger.trace("Application TRACE log");
	        logger.debug("Application DEBUG log");
	        logger.info("Application INFO log");
	        logger.warn("Application WARN log");
	        logger.error("Application ERROR log");
	        
		SpringApplication.run(SpringbootLoggingDemoApplication.class, args);
	}

}
