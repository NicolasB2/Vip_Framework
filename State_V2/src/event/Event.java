package event;

public abstract class Event implements SystemEvent,ExternalEvent{

	private String description;

	public Event(String description) {
		super();
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Event generateEvent() {
		throw new UnsupportedOperationException();
	}

}