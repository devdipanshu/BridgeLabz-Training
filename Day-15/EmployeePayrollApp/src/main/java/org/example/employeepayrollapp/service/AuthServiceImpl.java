package org.example.employeepayrollapp.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.employeepayrollapp.dto.request.LoginRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.exception.InvalidRegisterRequestException;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.example.employeepayrollapp.security.CustomUserDetailsService;
import org.example.employeepayrollapp.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Data
@Slf4j
public class AuthServiceImpl implements AuthService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Override
    @Transactional
    public ResponseEntity<RegisterResponseDTO> register(Employee employee){
        log.info("Entered in register method of auth service");
        if(employee.getRole().name().equals("ADMIN")||employee.getRole().name().equals("MANAGER")){
            throw new InvalidRegisterRequestException("You cannot directly registered as admin");
        }
        employee.getDepartment().getEmployees().add(employee);
        String codedPassword = passwordEncoder.encode(employee.getPassword());
        employee.setPassword(codedPassword);
        Employee employee1 = employeeRepository.save(employee);
        log.info("service ke register method se exit lene wala h");
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeMapper.toDTO(employee1));
    }

    @Override
    @Transactional
    public ResponseEntity<String> login(LoginRequestDTO loginRequestDTO){
        String username = loginRequestDTO.getUsername();
        String password = loginRequestDTO.getPassword();

        Authentication authentication = new UsernamePasswordAuthenticationToken(username,password);

        Authentication authentication1 = authenticationManager.authenticate(authentication);

        SecurityContextHolder.getContext().setAuthentication(authentication1);

        return ResponseEntity.status(HttpStatus.OK).body(jwtUtil.generateJwtToken(authentication1));

    }
}
