package com.vialibre.vialibre.controllers;


import com.vialibre.vialibre.models.Cita;
import com.vialibre.vialibre.services.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cita")
public class CitaController {

    private final CitaService citaService;

    @GetMapping("/all")
    public ResponseEntity<List<Cita>> getAllCitas() {
        return ResponseEntity.ok(citaService.getAllCitas().stream().filter(p -> !p.isDeleted()).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cita> getCitaById(@PathVariable String id) {
        return ResponseEntity.ok(citaService.getCitaById(id));
    }

    @PostMapping
    public ResponseEntity<Cita> createCita(@RequestBody Cita cita){
        return ResponseEntity.ok(citaService.saveCita(cita));
    }
}
