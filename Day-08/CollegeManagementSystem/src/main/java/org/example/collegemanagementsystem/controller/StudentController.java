package org.example.collegemanagementsystem.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.collegemanagementsystem.dto.request.StudentRequestDTO;
import org.example.collegemanagementsystem.dto.response.StudentResponseDTO;
import org.example.collegemanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @PostMapping("/")
    public StudentResponseDTO addStudent(@Valid @RequestBody StudentRequestDTO studentRequestDTO){
        return studentService.addStudent(studentRequestDTO);
    }
    @GetMapping("/")
    public List<StudentResponseDTO> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public StudentResponseDTO getStudentById(@PathVariable(name = "id") Long id){
        return studentService.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable(name = "id") Long id){
        studentService.deleteStudentById(id);
    }
}
