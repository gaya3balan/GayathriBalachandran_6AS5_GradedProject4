package com.greatlearning.EmployeeManagementRest.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.EmployeeManagementRest.entity.User;
import com.greatlearning.EmployeeManagementRest.repository.UserRepository;
import com.greatlearning.EmployeeManagementRest.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
		if (user == null) {
			System.out.println("Could not find user...." + username);
			throw new UsernameNotFoundException("Could not find user");
		}
		return new MyUserDetails(user);
	}
}
