package com.nagarro.ticketmanagement.enums;

public enum TicketStatus {

	OPEN("OPEN", 0), IN_PROGRESS("IN_PROGRESS", 1), CLOSED("CLOSED", 2);

	private String status;

	private int guiId;

	TicketStatus(String status, int guiId) {
		this.status = status;
		this.guiId = guiId;
	}

	TicketStatus() {

	}
}
