package com.vialibre.vialibre.services.impl;

import com.vialibre.vialibre.models.Especialidad;
import com.vialibre.vialibre.repositories.EspecialidadRepository;
import com.vialibre.vialibre.services.EspecialidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspecialidadServiceImpl implements EspecialidadService {

    private final EspecialidadRepository especialidadRepository;
    @Override
    public Especialidad saveEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public List<Especialidad> getAllEspecialidades() {
        return especialidadRepository.findAll();
    }

    @Override
    public Especialidad getEspecialidadById(String id) {
        return especialidadRepository.findById(id).orElseThrow();
    }
}
