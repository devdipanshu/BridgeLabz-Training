package org.example.employeepayrollapp.mapper;

import org.example.employeepayrollapp.dto.request.UpdateRequestDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUpdateMapper {

    public Employee fromDTO(UpdateRequestDTO updateRequestDTO,Employee employee){
        if(updateRequestDTO.getFirstName()!=null){
            employee.setFirstName(updateRequestDTO.getFirstName());
        }
        if(updateRequestDTO.getLastName()!=null){
            employee.setLastName(updateRequestDTO.getLastName());
        }
        if(updateRequestDTO.getPhone()!=null){
            employee.setPhone(updateRequestDTO.getPhone());
        }

        return employee;
    }

}
