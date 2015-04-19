package xu.main.java.distribute_crawler_common.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.log4j.Logger;

public class TextFileWriter {

	private static Logger logger = Logger.getLogger(TextFileWriter.class);

	public static boolean write(String filePath, String content, boolean isAppend) {

		BufferedWriter bw = null;
		try {
			File file = new File(filePath);
			if (file.isDirectory()) {
				return false;
			}
			if (!file.exists()) {
				file.getParentFile().mkdirs();
			}
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, isAppend)));
			bw.write(content);
			bw.newLine();
		} catch (FileNotFoundException e) {
			logger.warn("", e);
		} catch (IOException e) {
			logger.warn("", e);
		} finally {
			closeBufferedWriter(bw);
		}
		return true;
	}

	private static void closeBufferedWriter(BufferedWriter bw) {
		if (bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
