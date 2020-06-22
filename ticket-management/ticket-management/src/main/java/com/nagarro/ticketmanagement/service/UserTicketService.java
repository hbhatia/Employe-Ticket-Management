package com.nagarro.ticketmanagement.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.ticketmanagement.dtos.UserTicketDto;
import com.nagarro.ticketmanagement.entity.UserTicket;

public interface UserTicketService {
	
	List<UserTicket> findUserTicketByUserId(Long userId);

	//ResponseEntity<List<ToDo>> findToDoByUserName(String username);

	Optional<UserTicket> findById(Long id);

	UserTicket createUserTicket(UserTicket userTicket);

	UserTicket mapAndCreateUserTicket(UserTicketDto userTicketDto);

	List<UserTicket> findAllUserTicketByUser();
}
