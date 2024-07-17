package com.vialibre.vialibre.services.impl;

import com.vialibre.vialibre.models.Cita;
import com.vialibre.vialibre.repositories.CitaRepository;
import com.vialibre.vialibre.services.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitaServiceImpl implements CitaService {
    private final CitaRepository citaRepository;

    @Override
    public Cita saveCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    @Override
    public Cita getCitaById(String id) {
        return citaRepository.findById(id).orElseThrow();
    }

}
