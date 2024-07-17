package com.vialibre.vialibre.controllers;

import com.vialibre.vialibre.models.Doctor;
import com.vialibre.vialibre.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService doctorService;

    @RequestMapping("/all")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        return ResponseEntity.ok(doctorService.getAllDoctors().stream().filter(p -> !p.isDeleted()).toList());
    }

    @RequestMapping("{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable String id) {
        return ResponseEntity.ok(doctorService.getDoctorById(id));
    }

    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
        return ResponseEntity.ok(doctorService.saveDoctor(doctor));
    }


}
