package com.nagarro.ticketmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author harshitbhatia
 *
 */
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dept_id")
	private Long deptId;

	@Column(name = "dept_name")
	private String deptName;

	@Column(name = "is_dept_visible")
	private boolean isDeptVisible;

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
