package net.jotorren.microservices.rtsba.protocol.event;

public class BusinessActivityCloseEvent extends BusinessActivityEvent {
	private static final long serialVersionUID = 7642088887138589017L;

	public BusinessActivityCloseEvent(String coordinationContextId, String activityId) {
		super(coordinationContextId, activityId);
	}
}
