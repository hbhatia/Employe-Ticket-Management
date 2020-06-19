package com.nagarro.ticketmanagement.dto;

import com.nagarro.ticketmanagement.enums.TicketPriority;
import com.nagarro.ticketmanagement.enums.TicketStatus;

/**
 * @author harshitbhatia
 *
 */

public class UserTicketDto {

	private Long id;

	private TicketStatus ticketStatus;

	private TicketPriority ticketPriority;
	
	private Long userid;

	private String ticketName;
	
	private TicketDto ticketDto;
	
	private String subject;

	public UserTicketDto() {
	}

	public UserTicketDto(Long id, TicketStatus ticketStatus, TicketPriority ticketPriority, Long userid, String ticketName,
			String subject) {
		super();
		this.id = id;
		this.ticketStatus = ticketStatus;
		this.ticketPriority = ticketPriority;
		this.userid = userid;
		this.ticketName = ticketName;
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
		this.ticketStatus=ticketStatus;
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
	 * @return the ticketName
	 */
	public String getTicketName() {
		return ticketName;
	}

	/**
	 * @param ticketName the ticketName to set
	 */
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	/**
	 * @return the ticketDto
	 */
	public TicketDto getTicketDto() {
		return ticketDto;
	}

	/**
	 * @param ticketDto the ticketDto to set
	 */
	public void setTicketDto(TicketDto ticketDto) {
		this.ticketDto = ticketDto;
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
