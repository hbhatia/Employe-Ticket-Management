package com.nagarro.ticketmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.ticketmanagement.entity.Ticket;
import com.nagarro.ticketmanagement.service.TicketService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@GetMapping("/viewAllTickets")
	public ResponseEntity<List<Ticket>> getAllTickets() {
		try {
			List<Ticket> ticketLst = ticketService.getAllTickets();
				return new ResponseEntity<List<Ticket>>(ticketLst,HttpStatus.OK);
		}
		catch(Exception exc) {
			return new ResponseEntity<List<Ticket>>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	
	@GetMapping("/getAllTicketsByDepartmentId/{deptId}")
	public ResponseEntity<List<Ticket>> getAllTicketsByDepartmentId(@PathVariable Long deptId) {
		try {
			System.out.println("Harsh");
			List<Ticket> ticketLst = ticketService.getAllTicketsByDepartmentId(deptId);
				return new ResponseEntity<List<Ticket>>(ticketLst,HttpStatus.OK);
		}
		catch(Exception exc) {
			return new ResponseEntity<List<Ticket>>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	
	@GetMapping("/getAllTicketsByDepartmentName/{deptName}")
	public ResponseEntity<List<Ticket>> getAllTicketsByDepartmentName(@PathVariable String deptName) {
		try {
			List<Ticket> ticketLst = ticketService.getAllTicketsByDepartmentName(deptName);
				return new ResponseEntity<List<Ticket>>(ticketLst,HttpStatus.OK);
		}
		catch(Exception exc) {
			return new ResponseEntity<List<Ticket>>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	
	@PostMapping("/createTicket")
	public ResponseEntity<Ticket> createNewTicket(@RequestBody Ticket ticket) {
		ticket=ticketService.createNewTicket(ticket);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String getPageHello() {
		// return ticketService.getAllTickets();
		return "home1";
	}
}
