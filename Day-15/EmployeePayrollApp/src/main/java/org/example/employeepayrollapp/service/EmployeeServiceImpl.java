package org.example.employeepayrollapp.service;

import lombok.Data;
import org.example.employeepayrollapp.dto.request.UpdateRequestDTO;
import org.example.employeepayrollapp.dto.response.PayrollResponseDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.entity.Payroll;
import org.example.employeepayrollapp.enums.Role;
import org.example.employeepayrollapp.exception.EmployeeNotFoundException;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.mapper.EmployeeUpdateMapper;
import org.example.employeepayrollapp.mapper.PayrollMapper;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.example.employeepayrollapp.repository.PayrollRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final DepartmentRepository departmentRepository;
    private final EmployeeUpdateMapper employeeUpdateMapper;
    private final PayrollRepository payrollRepository;
    private final PayrollMapper payrollMapper;


    @Override
    public ResponseEntity<RegisterResponseDTO> getEmployeeById(Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee not" +
                "found with id: "+id));
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeMapper.toDTO(employee)
        );
    }

    @Override
    public ResponseEntity<List<RegisterResponseDTO>> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        List<RegisterResponseDTO> registerResponseDTOS = new ArrayList<>();

        for(Employee e : employees){
            registerResponseDTOS.add(employeeMapper.toDTO(e));
        }

        return ResponseEntity.status(HttpStatus.OK).body(registerResponseDTOS);
    }

    @Override
    public ResponseEntity<RegisterResponseDTO> getEmployeeByUsername(String username){
        Employee employee = employeeRepository.findByUsername(username);
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeMapper.toDTO(employee)
        );
    }

    @Override
    public ResponseEntity<List<RegisterResponseDTO>> getEmployeesByDepartmentName(String departmentName){
        List<Employee> employees = employeeRepository.findAllByDepartment_Name(departmentName);
        List<RegisterResponseDTO> registerResponseDTOS = new ArrayList<>();

        for(Employee e: employees){
            registerResponseDTOS.add(employeeMapper.toDTO(e));
        }
        return ResponseEntity.status(HttpStatus.OK).body(registerResponseDTOS);
    }

    @Override
    @Transactional
    public ResponseEntity<RegisterResponseDTO> updateUserDetails(Long employeeId,UpdateRequestDTO updateRequestDTO){

        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        Employee employee1 = employeeUpdateMapper.fromDTO(updateRequestDTO,employee);

        employee1.getDepartment().getEmployees().remove(employee);
        employee1.getDepartment().getEmployees().add(employee1);

        Employee result = employeeRepository.save(employee1);
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeMapper.toDTO(result));
    }

    @Override
    public ResponseEntity<List<PayrollResponseDTO>> getAllPayrolls(Long id){
        List<Payroll> payrolls = payrollRepository.getAllByEmployee_EmployeeId(id);
        List<PayrollResponseDTO> responseDTOS = new ArrayList<>();

        for(Payroll payroll : payrolls){
            responseDTOS.add(payrollMapper.toDTO(payroll));
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseDTOS);
    }

    @Override
    @Transactional
    public void promoteToManager(long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee not" +
                "found with id: "+id));
        employee.setRole(Role.MANAGER);
    }
}
