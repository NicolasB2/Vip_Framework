package state;

import java.util.Date;

public class SITMPlanVersion implements IPlanVersion {

	private long planVersionid;
	private Date activationDate;
	private Date creationDate;

	public SITMPlanVersion() {

	}

	public SITMPlanVersion(int in, long activationDate, long creationDate) {
		throw new UnsupportedOperationException();
	}
	public long getPlanVersionid() {
		return planVersionid;
	}

	public void setPlanVersionid(long planVersionid) {
		this.planVersionid = planVersionid;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}