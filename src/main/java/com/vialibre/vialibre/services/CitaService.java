package com.vialibre.vialibre.services;

import com.vialibre.vialibre.models.Cita;

import java.util.List;

public interface CitaService {
    Cita saveCita(Cita cita);
    List<Cita> getAllCitas();

    Cita getCitaById(String id);

}
