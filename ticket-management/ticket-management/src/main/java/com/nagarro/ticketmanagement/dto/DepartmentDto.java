package com.nagarro.ticketmanagement.dto;

/**
 * @author harshitbhatia
 *
 */
public class DepartmentDto {

	private Long deptId;

	private String deptName;

	private boolean isDeptVisible;

	public DepartmentDto() {

	}

	public DepartmentDto(Long deptId, String deptName, boolean isDeptVisible) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.isDeptVisible = isDeptVisible;
	}

	/**
	 * @return the deptId
	 */
	public Long getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the isDeptVisible
	 */
	public boolean isDeptVisible() {
		return isDeptVisible;
	}

	/**
	 * @param isDeptVisible the isDeptVisible to set
	 */
	public void setDeptVisible(boolean isDeptVisible) {
		this.isDeptVisible = isDeptVisible;
	}

}
