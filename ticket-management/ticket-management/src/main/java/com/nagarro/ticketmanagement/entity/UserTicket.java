package com.nagarro.ticketmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.nagarro.ticketmanagement.enums.TicketPriority;
import com.nagarro.ticketmanagement.enums.TicketStatus;

/**
 * @author harshitbhatia
 *
 */
@Entity
public class UserTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "ticket_status")
	private TicketStatus ticketStatus;

	@Column(name = "ticket_priority")
	private TicketPriority ticketPriority;

	@Column(name = "user_id")
	private Long userid;

	@OneToOne
	@JoinColumn(name = "ticket_id")
	private Ticket ticket;

	@Column(name = "subject")
	private String subject;

	public UserTicket() {

	}

	public UserTicket(Long id, TicketStatus ticketStatus, TicketPriority ticketPriority, Long userid, Ticket ticket,
			String subject) {
		super();
		this.id = id;
		this.ticketStatus = ticketStatus;
		this.ticketPriority = ticketPriority;
		this.userid = userid;
		this.ticket = ticket;
		this.subject = subject;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ticketStatus
	 */
	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	/**
	 * @param ticketStatus the ticketStatus to set
	 */
	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	/**
	 * @return the ticketPriority
	 */
	public TicketPriority getTicketPriority() {
		return ticketPriority;
	}

	/**
	 * @param ticketPriority the ticketPriority to set
	 */
	public void setTicketPriority(TicketPriority ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	/**
	 * @return the userid
	 */
	public Long getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}

	/**
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
}
