package session38_Log4j2Demo;

import org.apache.logging.log4j.*;

public class LoggerDemo {
	
	public static void main(String[] args) {
		
		Logger logger=LogManager.getLogger("LoggerDemo");
		System.out.println("Logger Demo");
		
		logger.info("for info only");
		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warning msg");
		logger.debug("for Debug");
	}

}
