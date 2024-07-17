package com.vialibre.vialibre.services;

import com.vialibre.vialibre.models.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor saveDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(String id);
}
