package net.jotorren.microservices.rtsba.protocol.event;

public class BusinessActivityFailCancelingEvent extends BusinessActivityEvent {
	private static final long serialVersionUID = 5833312541047625895L;

	public BusinessActivityFailCancelingEvent(String coordinationContextId, String activityId) {
		super(coordinationContextId, activityId);
	}
}
