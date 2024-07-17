package com.vialibre.vialibre.services;

import com.vialibre.vialibre.models.Horario;

import java.util.List;

public interface HorarioService {

    Horario saveHorario(Horario horario);

    List<Horario> getAllHorarios();
    Horario getHorarioById(String id);
}
