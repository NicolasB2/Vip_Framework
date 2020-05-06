package state;

public class SITMTrip implements ITrip {

	private long tripID;
	private String tripSequence;
	private String startTask;
	private String description;
	private boolean orientation;
	private long planVersionID;
	private long lineID;
	private long startStopID;
	private long endStopID;
	
	
	public SITMTrip(long tripID, String tripSequence, String startTask, String description, boolean orientation,
			long planVersionID, long lineID, long startStopID, long endStopID) {
		super();
		this.tripID = tripID;
		this.tripSequence = tripSequence;
		this.startTask = startTask;
		this.description = description;
		this.orientation = orientation;
		this.planVersionID = planVersionID;
		this.lineID = lineID;
		this.startStopID = startStopID;
		this.endStopID = endStopID;
	}
	public long getTripID() {
		return tripID;
	}
	public void setTripID(long tripID) {
		this.tripID = tripID;
	}
	public String getTripSequence() {
		return tripSequence;
	}
	public void setTripSequence(String tripSequence) {
		this.tripSequence = tripSequence;
	}
	public String getStartTask() {
		return startTask;
	}
	public void setStartTask(String startTask) {
		this.startTask = startTask;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isOrientation() {
		return orientation;
	}
	public void setOrientation(boolean orientation) {
		this.orientation = orientation;
	}
	public long getPlanVersionID() {
		return planVersionID;
	}
	public void setPlanVersionID(long planVersionID) {
		this.planVersionID = planVersionID;
	}
	public long getLineID() {
		return lineID;
	}
	public void setLineID(long lineID) {
		this.lineID = lineID;
	}
	public long getStartStopID() {
		return startStopID;
	}
	public void setStartStopID(long startStopID) {
		this.startStopID = startStopID;
	}
	public long getEndStopID() {
		return endStopID;
	}
	public void setEndStopID(long endStopID) {
		this.endStopID = endStopID;
	}
	

}