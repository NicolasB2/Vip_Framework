package state;

public class SITMLine implements IRute {

	private Long lineid;
	private String shortName;
	private String description;
	private Long planVersionID;

	public void RuteSITM() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param descripti
	 */
	public void RuteSITM(String id, String name, String descripti) {

	}

	public SITMLine(Long lineid, String shortName, String description, Long planVersionID) {
		super();
		this.lineid = lineid;
		this.shortName = shortName;
		this.description = description;
		this.planVersionID = planVersionID;
	}

	public Long getLineid() {
		return lineid;
	}

	public void setLineid(Long lineid) {
		this.lineid = lineid;
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

	public Long getPlanVersionID() {
		return planVersionID;
	}

	public void setPlanVersionID(Long planVersionID) {
		this.planVersionID = planVersionID;
	}

}