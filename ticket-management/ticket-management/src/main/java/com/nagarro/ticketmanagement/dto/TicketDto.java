package com.nagarro.ticketmanagement.dto;

public class TicketDto {

	private Long ticketId;

	private String ticketName;

	private boolean isTicketVisible;

	private DepartmentDto departmentDto;

	public TicketDto() {

	}

	public TicketDto(Long ticketId, String ticketName, boolean isTicketVisible, DepartmentDto departmentDto) {
		super();
		this.ticketId = ticketId;
		this.ticketName = ticketName;
		this.isTicketVisible = isTicketVisible;
		this.departmentDto = departmentDto;
	}

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
	 * @return the departmentDto
	 */
	public DepartmentDto getDepartment() {
		return departmentDto;
	}

	/**
	 * @param departmentDto the departmentDto to set
	 */
	public void setDepartment(DepartmentDto departmentDto) {
		this.departmentDto = departmentDto;
	}

}
