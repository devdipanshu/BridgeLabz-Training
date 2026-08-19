package org.example.collegemanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.example.collegemanagementsystem.dto.request.StudentRequestDTO;
import org.example.collegemanagementsystem.dto.response.StudentResponseDTO;
import org.example.collegemanagementsystem.entity.Student;
import org.example.collegemanagementsystem.exception.EmployeeNotFound;
import org.example.collegemanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public List<StudentResponseDTO> getAllStudent(){
       List<Student> students = studentRepository.findAll();
       List<StudentResponseDTO> studentResponseDTOS = new ArrayList<>();
       for(Student key: students){
           studentResponseDTOS.add(key.toDto());
       }
       return studentResponseDTOS;
    }

    public StudentResponseDTO addStudent(StudentRequestDTO studentRequestDTO){
        Student student = Student.builder().firstName(studentRequestDTO.getFirstName())
                .lastName(studentRequestDTO.getLastName())
                .address(studentRequestDTO.getAddress())
                .admissionDate(studentRequestDTO.getAdmissionDate())
                .city(studentRequestDTO.getCity())
                .course(studentRequestDTO.getCourse())
                .dateOfBirth(studentRequestDTO.getDateOfBirth())
                .department(studentRequestDTO.getDepartment())
                .email(studentRequestDTO.getEmail())
                .fatherName(studentRequestDTO.getFatherName())
                .gender(studentRequestDTO.getGender())
                .guardianPhone(studentRequestDTO.getGuardianPhone())
                .motherName(studentRequestDTO.getMotherName())
                .phoneNumber(studentRequestDTO.getPhoneNumber())
                .pincode(studentRequestDTO.getPincode())
                .semester(studentRequestDTO.getSemester())
                .state(studentRequestDTO.getState())
                .status(studentRequestDTO.getStatus())
                .build();

        return studentRepository.save(student).toDto();
    }

    public StudentResponseDTO getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(()-> new EmployeeNotFound("Unable to find Student", HttpStatus.NOT_FOUND)).toDto();
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }

}
