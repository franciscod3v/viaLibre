package com.vialibre.vialibre.repositories;

import com.vialibre.vialibre.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findByDni(String dni);
}
