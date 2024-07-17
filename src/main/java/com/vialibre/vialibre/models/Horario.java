package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "horario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Horario {
    @Id
    private String id;
    private String fecha;
    private int numCitas;
    private List<DetalleHorario> detalleHorarios;
    @JsonProperty("is_deleted")
    private boolean isDeleted;


    @Data
    public static class DetalleHorario {
        private int citasDisponibles;
        private String especialidad;
        private List<Cita> citas;
    }
}
