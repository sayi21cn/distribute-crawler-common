package xu.main.java.distribute_crawler_common.result;

import xu.main.java.distribute_crawler_common.util.GsonUtil;

public class ErrorJsonResult {

	public static final String SERVER_ERROR = GsonUtil.toJson(new JsonResult(1, "ServerError"));

}
