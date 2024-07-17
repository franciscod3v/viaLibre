package com.vialibre.vialibre.repositories;

import com.vialibre.vialibre.models.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitaRepository extends MongoRepository<Cita, String> {

}
