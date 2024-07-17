package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicamentos {
    @Id
    private String id;
    private String nombre;
    private String marca;
    private Double precioDeVenta;
    private Double precioDeCompra;
    private String estado;
    private int cantidadDisponible;
    @JsonProperty("is_deleted")
    private boolean isDeleted;
}
