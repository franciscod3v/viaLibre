package com.vialibre.vialibre.repositories;

import com.vialibre.vialibre.models.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRespository extends MongoRepository<Doctor, String> {
}
