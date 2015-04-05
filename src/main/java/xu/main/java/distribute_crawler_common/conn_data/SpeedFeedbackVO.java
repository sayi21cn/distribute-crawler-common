package xu.main.java.distribute_crawler_common.conn_data;

public class SpeedFeedbackVO {

	private int taskId;

	private int speed;

	private String md5;

	public SpeedFeedbackVO() {
	}

	public SpeedFeedbackVO(int taskId, int speed) {
		this.taskId = taskId;
		this.speed = speed;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

}
