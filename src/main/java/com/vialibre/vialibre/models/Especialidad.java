package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "especialidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Especialidad {
    private String id;
    private String especialidad;
    private List<Doctor> doctores;
    @JsonProperty("is_deleted")
    private boolean isDeleted;
}
