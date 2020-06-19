package com.nagarro.ticketmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket_id")
	private Long ticketId;
	
	@Column(name="ticket_name")
	private String ticketName;
	
	@Column(name="is_ticket_visible")
	private boolean isTicketVisible;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="dept_id")
	private Department department;
	
	/**
	 * @return the ticketId
	 */
	public Long getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
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
	 * @return the isTicketVisible
	 */
	public boolean isTicketVisible() {
		return isTicketVisible;
	}

	/**
	 * @param isTicketVisible the isTicketVisible to set
	 */
	public void setTicketVisible(boolean isTicketVisible) {
		this.isTicketVisible = isTicketVisible;
	}
	
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	
}
