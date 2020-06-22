package com.nagarro.ticketmanagement.enums;

public enum TicketPriority {

	NORMAL("NORMAL"), URGENT("URGENT"), IMEEDIATE("IMEEDIATE");

	private String guiValue;

	TicketPriority(String guiValue) {
		this.guiValue = guiValue;
	}

	TicketPriority() {

	}
}
