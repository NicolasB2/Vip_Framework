package state.SITMProduct;

import state.ProductInterface.IArcs;

public class SITMArc implements IArcs {

	private long arcID;
	private long starPoint;
	private long endPoint;
	private String description;
	private String ArcLength;
	private long planVersionID;
	
	public SITMArc(long arcID, long starPoint, long endPoint, String description, String arcLength,
			long planVersionID) {
		super();
		this.arcID = arcID;
		this.starPoint = starPoint;
		this.endPoint = endPoint;
		this.description = description;
		ArcLength = arcLength;
		this.planVersionID = planVersionID;
	}
	public long getArcID() {
		return arcID;
	}
	public void setArcID(long arcID) {
		this.arcID = arcID;
	}
	public long getStarPoint() {
		return starPoint;
	}
	public void setStarPoint(long starPoint) {
		this.starPoint = starPoint;
	}
	public long getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(long endPoint) {
		this.endPoint = endPoint;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getArcLength() {
		return ArcLength;
	}
	public void setArcLength(String arcLength) {
		ArcLength = arcLength;
	}
	public long getPlanVersionID() {
		return planVersionID;
	}
	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}

}