package state;

import java.util.Date;

public class SITMCalendar implements ICalendar {

	private long calendarID;
	private Date operationDate;
	private String scheduleTypeID;
	private long planVersionID;
	
	public SITMCalendar(long calendarID, Date operationDate, String scheduleTypeID, long planVersionID) {
		super();
		this.calendarID = calendarID;
		this.operationDate = operationDate;
		this.scheduleTypeID = scheduleTypeID;
		this.planVersionID = planVersionID;
	}
	public long getCalendarID() {
		return calendarID;
	}
	public void setCalendarID(long calendarID) {
		this.calendarID = calendarID;
	}
	public Date getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	public String getScheduleTypeID() {
		return scheduleTypeID;
	}
	public void setScheduleTypeID(String scheduleTypeID) {
		this.scheduleTypeID = scheduleTypeID;
	}
	public long getPlanVersionID() {
		return planVersionID;
	}
	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}

}