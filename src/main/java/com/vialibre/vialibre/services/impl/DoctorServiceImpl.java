package com.vialibre.vialibre.services.impl;

import com.vialibre.vialibre.models.Doctor;
import com.vialibre.vialibre.repositories.DoctorRespository;
import com.vialibre.vialibre.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRespository doctorRespository;
    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRespository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRespository.findAll();
    }

    @Override
    public Doctor getDoctorById(String id) {
        return doctorRespository.findById(id).orElseThrow();
    }
}
