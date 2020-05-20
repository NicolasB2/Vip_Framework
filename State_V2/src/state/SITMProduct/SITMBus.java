package state.SITMProduct;

import state.ProductInterface.IBus;

public class SITMBus implements IBus {

	private long busId;
	private long busNumber;
	private String identification;
	
	public SITMBus(long busId, long busNumber, String identification, long planVersionID) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.identification = identification;
		this.planVersionID = planVersionID;
	}
	public long getBusId() {
		return busId;
	}
	public void setBusId(long busId) {
		this.busId = busId;
	}
	public long getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(long busNumber) {
		this.busNumber = busNumber;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public long getPlanVersionID() {
		return planVersionID;
	}
	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}
	private long planVersionID;

}