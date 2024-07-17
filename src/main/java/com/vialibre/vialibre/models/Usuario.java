package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String password;
    private String cargo;
    private String dni;
    @JsonProperty("is_deleted")
    private boolean isDeleted;
}
