package simulation;

public class Clock extends Timer {

	private Long time;

	public Clock(Long time) {
		super();
		this.time = time;
	}
	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Clock() {
		throw new UnsupportedOperationException();
	}

	public void InitializateClock() {
		throw new UnsupportedOperationException();
	}

	public void getNextTick() {
		throw new UnsupportedOperationException();
	}

	public void stopClock() {
		throw new UnsupportedOperationException();
	}

}