package com.vialibre.vialibre.repositories;

import com.vialibre.vialibre.models.Especialidad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialidadRepository extends MongoRepository<Especialidad, String> {

}
