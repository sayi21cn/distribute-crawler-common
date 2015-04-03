package xu.main.java.distribute_crawler_common.result;

public class JsonResult {

	private int errorCode = 0;

	private String describe = "";

	public JsonResult() {
	}

	public JsonResult(int errorCode, String describe) {
		this.errorCode = errorCode;
		this.describe = describe;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

}
