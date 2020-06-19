package com.nagarro.ticketmanagement.enums;

public enum TicketPriority {

	NORMAL("NORMAL", 1), URGENT("URGENT", 2), IMEEDIATE("IMEEDIATE", 3);

	private String guiValue;

	private int guiId;

	TicketPriority(String guiValue, int guiId) {
		this.guiValue = guiValue;
		this.guiId = guiId;
	}

	TicketPriority() {

	}
}
