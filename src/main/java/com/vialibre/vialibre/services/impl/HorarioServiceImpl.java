package com.vialibre.vialibre.services.impl;

import com.vialibre.vialibre.models.Horario;
import com.vialibre.vialibre.repositories.HorarioRepository;
import com.vialibre.vialibre.services.HorarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HorarioServiceImpl implements HorarioService {

    private final HorarioRepository horarioRepository;
    @Override
    public Horario saveHorario(Horario horario) {
        return horarioRepository.save(horario);
    }

    @Override
    public List<Horario> getAllHorarios() {
        return horarioRepository.findAll();
    }

    @Override
    public Horario getHorarioById(String id) {
        return horarioRepository.findById(id).orElseThrow();
    }
}
