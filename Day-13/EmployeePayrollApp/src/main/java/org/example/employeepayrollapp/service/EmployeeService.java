package org.example.employeepayrollapp.service;

import com.sun.net.httpserver.HttpsServer;
import lombok.Data;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final EmployeeMapper employeeMapper;
    @Autowired
    private final DepartmentRepository departmentRepository;

    public ResponseEntity<RegisterResponseDTO> getEmployeeById(Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow();
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeMapper.toDTO(employee)
        );
    }

    public ResponseEntity<List<RegisterResponseDTO>> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        List<RegisterResponseDTO> registerResponseDTOS = new ArrayList<>();

        for(Employee e : employees){
            registerResponseDTOS.add(employeeMapper.toDTO(e));
        }

        return ResponseEntity.status(HttpStatus.OK).body(registerResponseDTOS);
    }

    public ResponseEntity<RegisterResponseDTO> getEmployeeByUsername(String username){
        Employee employee = employeeRepository.findByUsername(username);
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeMapper.toDTO(employee)
        );
    }

//    public void addDepartment(Employee employee){
//        employee.getDepartment().getEmployees().add(employee);
//        departmentRepository.save(employee.getDepartment());
//        Employee e = employeeRepository.save(employee);
//    }

}
