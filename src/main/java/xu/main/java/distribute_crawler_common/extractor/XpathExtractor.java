package xu.main.java.distribute_crawler_common.extractor;

import java.util.List;
import java.util.Map;

import xu.main.java.distribute_crawler_common.vo.HtmlPath;

public class XpathExtractor implements IExtractor {

	public Map<String, String> extractorColumns(String html, List<HtmlPath> pathList,String dbSplitString) {

		for (@SuppressWarnings("unused") HtmlPath htmlPath : pathList) {
			// XElements xElements = Xsoup.select(html,
			// htmlPath.getDirPathList());
			// xElements.get();
		}

		return null;
	}

}
