package com.nagarro.ticketmanagement.security.jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.nagarro.ticketmanagement.entity.Employee;
import com.nagarro.ticketmanagement.repository.EmployeeRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	/*
	 * static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();
	 * 
	 * static { inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
	 * "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e",
	 * "ROLE_USER_2")); }
	 */
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee emp=empRepository.findByUserName(username);
		if (null==emp) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}
		JwtUserDetails userDetails = new JwtUserDetails(emp.getEmpId(), emp.getUserName(), emp.getUserPasswd(), null);
		return userDetails;
	}

}
