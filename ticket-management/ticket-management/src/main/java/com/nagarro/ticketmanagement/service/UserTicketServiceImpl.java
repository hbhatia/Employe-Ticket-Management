package com.nagarro.ticketmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.dto.UserTicketDto;
import com.nagarro.ticketmanagement.entity.Ticket;
import com.nagarro.ticketmanagement.entity.UserTicket;
import com.nagarro.ticketmanagement.repository.UserTicketRepository;

@Service
public class UserTicketServiceImpl implements UserTicketService {

	@Autowired
	private UserTicketRepository userTicketRepository;
	
	@Autowired
	private TicketService ticketService;

	@Override
	public List<UserTicket> findUserTicketByUserId(Long userId) {
		return userTicketRepository.findByTicketUser(userId);
	}

	@Override
	public Optional<UserTicket> findById(Long id) {
		return userTicketRepository.findById(id);
	}

	@Override
	public UserTicket createUserTicket(UserTicket userTicket) {
		return userTicketRepository.save(userTicket);
	}

	@Override
	public UserTicket mapAndCreateUserTicket(UserTicketDto userTicketDto) {
		//Create userTicket
		UserTicket userTicket=new UserTicket();
		userTicket.setTicketPriority(userTicketDto.getTicketPriority());
		userTicket.setTicketStatus(userTicketDto.getTicketStatus());
		userTicket.setSubject(userTicketDto.getSubject());
		Ticket ticket=ticketService.getTicketByName(userTicketDto.getTicketName());
		userTicket.setTicket(ticket);
		//Save UserTicket
		userTicket=saveUserTicket(userTicket);
		return userTicket;
	}

	public UserTicket saveUserTicket(UserTicket userTicket) {
		return userTicketRepository.save(userTicket);
	}
}
