package state.SITMProduct;

import state.ProductInterface.ITask;

public class SITMTask implements ITask {

	private long taskID;
	private long scheduleTypeID;
	private long LineID;
	private long planVersionID;
	
	public SITMTask(long taskID, long scheduleTypeID, long lineID, long planVersionID) {
		super();
		this.taskID = taskID;
		this.scheduleTypeID = scheduleTypeID;
		LineID = lineID;
		this.planVersionID = planVersionID;
	}
	
	public long getTaskID() {
		return taskID;
	}
	public void setTaskID(long taskID) {
		this.taskID = taskID;
	}
	public long getScheduleTypeID() {
		return scheduleTypeID;
	}
	public void setScheduleTypeID(long scheduleTypeID) {
		this.scheduleTypeID = scheduleTypeID;
	}
	public long getLineID() {
		return LineID;
	}
	public void setLineID(long lineID) {
		LineID = lineID;
	}
	public long getPlanVersionID() {
		return planVersionID;
	}
	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}

}