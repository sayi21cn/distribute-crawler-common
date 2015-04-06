package xu.main.java.distribute_crawler_common.util;

import org.apache.log4j.Logger;

public class ThreadUtil {

	private static Logger logger = Logger.getLogger(ThreadUtil.class);

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			logger.error("", e);
		}
	}

}
