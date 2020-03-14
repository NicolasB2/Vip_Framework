package concreteSITM;

import java.util.Date;

import productFamilies.IPlane;

public class PlaneSITM implements IPlane {

	private String id;
	private Date startDate;
	private Date endDate;
	
	public PlaneSITM() {
	}

	public PlaneSITM(String id, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

	
}
