package org.example.employeepayrollapp.security;

import lombok.Data;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@Data
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = employeeRepository.findByUsername(username);
        return User.withUsername(employee.getUsername())
                .password(employee.getPassword())
                .authorities("ROLE_"+employee.getRole())
                .build();
    }
}
