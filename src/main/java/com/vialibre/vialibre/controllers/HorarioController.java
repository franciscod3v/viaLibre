package com.vialibre.vialibre.controllers;

import com.vialibre.vialibre.models.Horario;
import com.vialibre.vialibre.services.HorarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/horario")
public class HorarioController {

    private final HorarioService horarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Horario>> getAllHorarios() {
        return ResponseEntity.ok(horarioService.getAllHorarios().stream().filter(p -> !p.isDeleted()).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Horario> getHorarioById(@PathVariable String id) {
        return ResponseEntity.ok(horarioService.getHorarioById(id));
    }

    @PostMapping
    public ResponseEntity<Horario> createHorario(@RequestBody Horario horario){
        return ResponseEntity.ok(horarioService.saveHorario(horario));
    }
}
