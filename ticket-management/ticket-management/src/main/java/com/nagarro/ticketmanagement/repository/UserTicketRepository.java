package com.nagarro.ticketmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nagarro.ticketmanagement.entity.UserTicket;

@Repository
public interface UserTicketRepository extends JpaRepository<UserTicket, Long>{

	@Query("Select ut from UserTicket ut where ut.userid= ?1")
	List<UserTicket> findByTicketUser(Long userId);
}
