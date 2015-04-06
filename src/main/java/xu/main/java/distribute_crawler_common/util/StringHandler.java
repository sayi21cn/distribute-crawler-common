package xu.main.java.distribute_crawler_common.util;

public class StringHandler {

	public static int string2Int(String input, int defaultNum) {
		int result = defaultNum;
		try {
			result = Integer.parseInt(input);
		} catch (NumberFormatException e) {
		}
		return result;
	}

	public static boolean isNullOrEmpty(String input) {
		return null == input || "".equals(input);
	}

	public static String nullToEmpty(Object o) {
		if (null == o) {
			return "";
		}
		return o.toString();
	}

}
