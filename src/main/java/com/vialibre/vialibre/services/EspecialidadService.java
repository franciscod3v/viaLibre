package com.vialibre.vialibre.services;

import com.vialibre.vialibre.models.Especialidad;

import java.util.List;

public interface EspecialidadService {
    Especialidad saveEspecialidad(Especialidad especialidad);
    List<Especialidad> getAllEspecialidades();

    Especialidad getEspecialidadById(String id);
}
