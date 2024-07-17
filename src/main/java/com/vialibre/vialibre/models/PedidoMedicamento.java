package com.vialibre.vialibre.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pedidomedicamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoMedicamento {
    @Id
    private String id;
    private String idUsuario;
    private List<Medicamentos> medicamentosList;
    private Double costoTotal;
    private String fechaSolicitud;
    private String fechaEnvio;
    private String estado;
    @JsonProperty("is_deleted")
    private boolean isDeleted;
}
