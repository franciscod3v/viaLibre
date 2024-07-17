package com.vialibre.vialibre.controllers;


import com.vialibre.vialibre.models.Especialidad;
import com.vialibre.vialibre.services.EspecialidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/especialidad")
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    @RequestMapping("/all")
    public ResponseEntity<List<Especialidad>> getAllEspecialidades() {
        return ResponseEntity.ok(especialidadService.getAllEspecialidades().stream().filter(p -> !p.isDeleted()).toList());
    }

    @RequestMapping("{id}")
    public ResponseEntity<Especialidad> getEspecialidadById(@PathVariable String id) {
        return ResponseEntity.ok(especialidadService.getEspecialidadById(id));
    }

    @PostMapping
    public ResponseEntity<Especialidad> createDoctor(@RequestBody Especialidad especialidad) {
        return ResponseEntity.ok(especialidadService.saveEspecialidad(especialidad));
    }
}
