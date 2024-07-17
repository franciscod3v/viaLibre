package com.vialibre.vialibre.repositories;

import com.vialibre.vialibre.models.Horario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HorarioRepository extends MongoRepository<Horario, String> {

}
