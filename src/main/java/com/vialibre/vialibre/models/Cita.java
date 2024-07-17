package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cita")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cita {
    @Id
    private String id;
    private int orden;
    private String idUsuario;
    private Doctor doctor;
    private String especialidad;
    private String fechaYHora;
    private String costo;
    private String estado;
    private String diagnostico;
    @JsonProperty("is_deleted")
    private boolean isDeleted;
}
