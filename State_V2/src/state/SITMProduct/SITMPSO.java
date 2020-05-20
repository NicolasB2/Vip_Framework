package state.SITMProduct;

import java.util.Date;

import state.ProductInterface.IPlan;



public class SITMPSO implements IPlan {

	private Long id;
	private Date startDate;
	private Date endDate;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void PSOSITM() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param startDate
	 * @param endDate
	 */
	public void PSOSITM(String id, long startDate, long endDate) {
		throw new UnsupportedOperationException();
	}

}