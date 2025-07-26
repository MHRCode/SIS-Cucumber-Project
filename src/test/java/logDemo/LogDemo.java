package logDemo;
import org.apache.logging.log4j.*;

public class LogDemo {
	
	public static void main (String[]args) {
		
		Logger log = LogManager.getLogger("LogDemo");
		
		System.out.println("this is logger demo");
		log.info("for info only");
		log.debug("for debug");
		log.error("for error");
		log.warn("for warn");
	}

}
