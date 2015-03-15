package xu.main.java.distribute_crawler_common.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpDownload {

	private static Pattern p = Pattern.compile("(?<=charset=)(.+)(?=\")");

	public static String download(String url, String charSet) {

		InputStream in = null;
		try {
			in = new URL(url).openConnection().getInputStream();
			byte[] inputArray = readAll(in);
			String content = new String(inputArray, charSet);
			String matchedCharset = matchCharset(content);
			if (!charSet.equals(matchedCharset)) {
				content = new String(inputArray, matchedCharset);
			}
			return content;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}

	public static String matchCharset(String content) {
		Matcher m = p.matcher(content);
		if (m.find())
			return m.group();
		return "utf-8";
	}

	/**
	 * 从输入流中读取所有字节
	 * 
	 * @param in
	 *            输入流
	 * @return 字节数组
	 */
	public static byte[] readAll(InputStream in) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			byte[] buffer = new byte[4096];
			for (int n; (n = in.read(buffer)) > 0;) {
				out.write(buffer, 0, n);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return out.toByteArray();
	}

	public static void main(String[] args) {
		String url = "http://www.ygdy8.net/html/gndy/dyzz/list_23_1.html";
		String charSet = "utf-8";
		System.out.println(download(url, charSet));
	}
}
