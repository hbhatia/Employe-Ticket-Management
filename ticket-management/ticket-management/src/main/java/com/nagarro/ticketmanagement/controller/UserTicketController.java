package com.nagarro.ticketmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.ticketmanagement.dtos.UserTicketDto;
import com.nagarro.ticketmanagement.entity.UserTicket;
import com.nagarro.ticketmanagement.service.UserTicketService;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class UserTicketController {

	@Autowired
	private UserTicketService userTicketService;

	/*
	 * @GetMapping("/findAllToDosByuser/{username}") public
	 * ResponseEntity<List<ToDo>> findAllToDosByuser(@PathVariable String username){
	 * return userTicketService.findToDoByUserName(username); }
	 */

	/*
	 * @DeleteMapping("/deleteToDoById/{id}") public ResponseEntity<List<ToDo>>
	 * deleteToDoById(@PathVariable int id) { return null; }
	 */

	@GetMapping("/findTicketById/{userticketid}")
	public ResponseEntity<UserTicket> findUserTicketById(@PathVariable Long userticketid) {
		Optional<UserTicket> userTicket = userTicketService.findById(userticketid);
		if (userTicket.isPresent()) {
			return new ResponseEntity<UserTicket>(userTicket.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<UserTicket>(HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping("/findTicketByUserId/{userId}")
	public ResponseEntity<List<UserTicket>> findUserTicketByUserId(@PathVariable Long userId) {
		List<UserTicket> userTickets = new ArrayList<UserTicket>();
		try {
			userTickets = userTicketService.findUserTicketByUserId(userId);
		} catch (Exception exc) {

		}
		return new ResponseEntity<List<UserTicket>>(userTickets, HttpStatus.OK);
	}

	@PostMapping("/createUserTicket/")
	public ResponseEntity<UserTicket> createUserTicket(@RequestBody UserTicketDto userTicketDto) {
		UserTicket userTicket=userTicketService.mapAndCreateUserTicket(userTicketDto);
		if(null!=userTicket && null!=userTicket.getId()) {
			return new ResponseEntity<UserTicket>(userTicket, HttpStatus.CREATED);
		}
		return new ResponseEntity<UserTicket>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/updateUserTicket")
	public ResponseEntity<UserTicket> updateUserTicket(@RequestBody UserTicketDto userTicket) {
		System.out.println(userTicket);
		return null;
		/*
		 * if (null != userTicket) { UserTicket createdUserTicket =
		 * userTicketService.createUserTicket(userTicket); return new
		 * ResponseEntity<UserTicket>(createdUserTicket, HttpStatus.CREATED); } return
		 * new ResponseEntity<UserTicket>(HttpStatus.BAD_REQUEST);
		 */
	}
	
	@GetMapping("/viewAllUserTickets")
	public ResponseEntity<List<UserTicket>> viewAllUserTickets() {
		List<UserTicket> userTicketLst=new ArrayList<UserTicket>();
		userTicketLst=userTicketService.findAllUserTicketByUser();
		return new ResponseEntity<List<UserTicket>>(userTicketLst,HttpStatus.OK);
	}
	
}
