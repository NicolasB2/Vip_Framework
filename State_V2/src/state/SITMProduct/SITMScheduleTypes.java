package state.SITMProduct;

import state.ProductInterface.IScheduleTypes;

public class SITMScheduleTypes implements IScheduleTypes {

	private long scheduleTypesid;
	private String shortName;
	private String description;
	
	public SITMScheduleTypes(long scheduleTypesid, String shortName, String description, long planVersionID) {
		super();
		this.scheduleTypesid = scheduleTypesid;
		this.shortName = shortName;
		this.description = description;
		this.planVersionID = planVersionID;
	}
	public long getScheduleTypesid() {
		return scheduleTypesid;
	}
	public void setScheduleTypesid(long scheduleTypesid) {
		this.scheduleTypesid = scheduleTypesid;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPlanVersionID() {
		return planVersionID;
	}
	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}
	private long planVersionID;

}