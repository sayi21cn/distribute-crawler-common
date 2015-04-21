package xu.main.java.distribute_crawler_common.conn_data;

import java.util.Map;

public class ExtractResultVO {

	private int taskId;

	private Map<String, String> result;

	private String saveTableName;

	private int errorCode;

	private String errorMessage;

	public ExtractResultVO() {
	}

	public ExtractResultVO(int taskId) {
		this.taskId = taskId;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}

	public String getSaveTableName() {
		return saveTableName;
	}

	public void setSaveTableName(String saveTableName) {
		this.saveTableName = saveTableName;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
