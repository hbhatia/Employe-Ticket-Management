package com.nagarro.ticketmanagement.enums;

public enum TicketStatus {

	OPEN("OPEN"), IN_PROGRESS("IN_PROGRESS"), CLOSED("CLOSED");

	private String status;

	TicketStatus(String status) {
		this.status = status;
	}

	TicketStatus() {

	}
}
