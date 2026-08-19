package org.example.collegemanagementsystem.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.collegemanagementsystem.dto.request.FacultyRequestDTO;
import org.example.collegemanagementsystem.dto.response.FacultyResponseDTO;
import org.example.collegemanagementsystem.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/faculty")
@RequiredArgsConstructor
public class FacultyController {

    @Autowired
    private final FacultyService facultyService;

    @PostMapping("/")
    public FacultyResponseDTO addFaculty(
            @Valid @RequestBody FacultyRequestDTO facultyRequestDTO) {

        return facultyService.addFaculty(facultyRequestDTO);
    }

    @GetMapping("/")
    public List<FacultyResponseDTO> getAllFaculty() {

        return facultyService.getAllFaculty();
    }

    @GetMapping("/{id}")
    public FacultyResponseDTO getFacultyById(
            @PathVariable(name = "id") Long id) {

        return facultyService.getFacultyById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFacultyById(
            @PathVariable(name = "id") Long id) {

        facultyService.deleteFacultyById(id);
    }
}