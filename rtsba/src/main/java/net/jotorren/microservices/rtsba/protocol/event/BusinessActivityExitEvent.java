package net.jotorren.microservices.rtsba.protocol.event;

public class BusinessActivityExitEvent extends BusinessActivityEvent {
	private static final long serialVersionUID = 4616360651501302396L;

	public BusinessActivityExitEvent(String coordinationContextId, String activityId) {
		super(coordinationContextId, activityId);
	}
}
