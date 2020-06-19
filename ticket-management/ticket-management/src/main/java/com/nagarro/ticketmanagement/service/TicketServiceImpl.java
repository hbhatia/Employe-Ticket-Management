package com.nagarro.ticketmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.entity.Department;
import com.nagarro.ticketmanagement.entity.Ticket;
import com.nagarro.ticketmanagement.repository.DepartmentRepository;
import com.nagarro.ticketmanagement.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}
	
	@Override
	public List<Ticket> getAllTicketsByDepartmentId(Long deptId) {
		return ticketRepository.findAllTicketsByDepartmentId(deptId);
	}
	
	@Override
	public List<Ticket> getAllTicketsByDepartmentName(String deptName) {
		List<Ticket> ticketLst=new ArrayList<Ticket>();
		Department dept=departmentRepository.findByDeptNameIgnoreCase(deptName);
		if(null!=dept) {
			ticketLst=ticketRepository.findAllTicketsByDepartmentId(dept.getDeptId());
		}
		return ticketLst;
	}

	@Override
	public Ticket createNewTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket getTicketByName(String ticketName) {
		return ticketRepository.findByTicketName(ticketName);
	}

	

}
