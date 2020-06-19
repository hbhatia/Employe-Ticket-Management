package com.nagarro.ticketmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nagarro.ticketmanagement.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

	
	@Query("Select tkt from Ticket tkt where tkt.department.deptId= ?1")
	List<Ticket> findAllTicketsByDepartmentId(Long deptId);

	Ticket findByTicketName(String ticketName);

}
