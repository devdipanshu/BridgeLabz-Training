package org.example.collegemanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.example.collegemanagementsystem.dto.request.FacultyRequestDTO;
import org.example.collegemanagementsystem.dto.response.FacultyResponseDTO;
import org.example.collegemanagementsystem.entity.Faculty;
import org.example.collegemanagementsystem.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FacultyService {

    @Autowired
    private final FacultyRepository facultyRepository;

    public List<FacultyResponseDTO> getAllFaculty() {

        List<Faculty> faculties = facultyRepository.findAll();

        List<FacultyResponseDTO> facultyResponseDTOS = new ArrayList<>();

        for (Faculty key : faculties) {
            facultyResponseDTOS.add(key.toDto());
        }

        return facultyResponseDTOS;
    }

    public FacultyResponseDTO addFaculty(FacultyRequestDTO facultyRequestDTO) {

        Faculty faculty = Faculty.builder()
                .firstName(facultyRequestDTO.getFirstName())
                .lastName(facultyRequestDTO.getLastName())
                .gender(facultyRequestDTO.getGender())
                .dateOfBirth(facultyRequestDTO.getDateOfBirth())
                .email(facultyRequestDTO.getEmail())
                .phoneNumber(facultyRequestDTO.getPhoneNumber())
                .address(facultyRequestDTO.getAddress())
                .city(facultyRequestDTO.getCity())
                .state(facultyRequestDTO.getState())
                .pincode(facultyRequestDTO.getPincode())
                .department(facultyRequestDTO.getDepartment())
                .designation(facultyRequestDTO.getDesignation())
                .qualification(facultyRequestDTO.getQualification())
                .joiningDate(facultyRequestDTO.getJoiningDate())
                .experience(facultyRequestDTO.getExperience())
                .salary(facultyRequestDTO.getSalary())
                .build();

        return facultyRepository.save(faculty).toDto();
    }

    public FacultyResponseDTO getFacultyById(Long id) {

        return facultyRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Unable to find the faculty"))
                .toDto();
    }

    public void deleteFacultyById(Long id) {

        facultyRepository.deleteById(id);
    }
}