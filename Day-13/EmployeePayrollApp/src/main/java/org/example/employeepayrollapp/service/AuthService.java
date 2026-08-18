package org.example.employeepayrollapp.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.employeepayrollapp.dto.request.LoginRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.enums.Role;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.example.employeepayrollapp.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
@Slf4j
public class AuthService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtUtil jwtUtil;

    public ResponseEntity<RegisterResponseDTO> register(Employee employee){
        log.info("service ke register method m enter kar gya");
        employee.getDepartment().getEmployees().add(employee);
        Employee employee1 = employeeRepository.save(employee);
        log.info("service ke register method se exit lene wala h");
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeMapper.toDTO(employee1));
    }

    public ResponseEntity<String> login(LoginRequestDTO loginRequestDTO){
        String username = loginRequestDTO.getEmail();
        String password = loginRequestDTO.getPassword();

        String role = employeeRepository.findByUsername(username).getRole().name();

        UserDetails userDetails = User.withUsername(username)
                .password(password)
                .authorities("ROLE_"+role)
                .build();

        Authentication authentication = new UsernamePasswordAuthenticationToken(username,password,userDetails.getAuthorities());

        Authentication authentication1 = authenticationManager.authenticate(authentication);

        SecurityContextHolder.getContext().setAuthentication(authentication1);

        return ResponseEntity.status(HttpStatus.OK).body(jwtUtil.generateJwtToken(userDetails));

    }
}
