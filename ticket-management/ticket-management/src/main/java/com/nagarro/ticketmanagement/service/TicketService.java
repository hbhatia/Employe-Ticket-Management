package com.nagarro.ticketmanagement.service;

import java.util.List;

import com.nagarro.ticketmanagement.entity.Ticket;

public interface TicketService {
	
	List<Ticket> getAllTickets();

	Ticket createNewTicket(Ticket ticket);

	List<Ticket> getAllTicketsByDepartmentId(Long deptId);

	List<Ticket> getAllTicketsByDepartmentName(String deptName);

	Ticket getTicketByName(String ticketName);
}
