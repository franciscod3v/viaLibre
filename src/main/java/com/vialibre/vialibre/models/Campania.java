package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "campania")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Campania {
    @Id
    private String id;
    private String especialidad;
    private List<String> correos;
    private String urlImagen;
    @JsonProperty("is_deleted")
    private boolean isDeleted;

}
