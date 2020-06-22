package com.nagarro.ticketmanagement.dtos;

/**
 * @author harshitbhatia
 *
 */
public class EmployeeDto {

	private Long empId;
	
	private String empFirstName;
	
	private String empLastName;
	
	private String empEmail;
	
	private boolean isEmpActive;
	
	private String userName;

	private String userPasswd;

	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * @return the empFirstName
	 */
	public String getEmpFirstName() {
		return empFirstName;
	}

	/**
	 * @param empFirstName the empFirstName to set
	 */
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}

	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the isEmpActive
	 */
	public boolean isEmpActive() {
		return isEmpActive;
	}

	/**
	 * @param isEmpActive the isEmpActive to set
	 */
	public void setEmpActive(boolean isEmpActive) {
		this.isEmpActive = isEmpActive;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPasswd
	 */
	public String getUserPasswd() {
		return userPasswd;
	}

	/**
	 * @param userPasswd the userPasswd to set
	 */
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
}
