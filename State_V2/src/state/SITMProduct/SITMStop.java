package state.SITMProduct;

import state.ProductInterface.IStop;

public class SITMStop implements IStop {
	private String longName;
	private long GPSX;
	private long GPSY;
	private long decimalLongitude;
	private long decimalLactitude;
	private long planVersionID;
	private long stopId;
	private String shortName;

	public void StopSITM() {
		throw new UnsupportedOperationException();
	}

	public void StopSITM(String id, long location) {
		throw new UnsupportedOperationException();
	}

	public long getStopId() {
		return stopId;
	}

	public void setStopId(long stopId) {
		this.stopId = stopId;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public long getGPSX() {
		return GPSX;
	}

	public void setGPSX(long gPSX) {
		GPSX = gPSX;
	}

	public long getGPSY() {
		return GPSY;
	}

	public void setGPSY(long gPSY) {
		GPSY = gPSY;
	}

	public long getDecimalLongitude() {
		return decimalLongitude;
	}

	public void setDecimalLongitude(long decimalLongitude) {
		this.decimalLongitude = decimalLongitude;
	}

	public long getDecimalLactitude() {
		return decimalLactitude;
	}

	public void setDecimalLactitude(long decimalLactitude) {
		this.decimalLactitude = decimalLactitude;
	}

	public long getPlanVersionID() {
		return planVersionID;
	}

	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}



}