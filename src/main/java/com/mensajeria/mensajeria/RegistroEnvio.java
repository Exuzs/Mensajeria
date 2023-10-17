package com.mensajeria.mensajeria;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "registros_envio")
public class RegistroEnvio extends Elemento {
    @ManyToOne
    @JoinColumn(name = "estado_envio_id")
    private EstadoEnvio estadoEnvio;

    @ManyToOne
    @JoinColumn(name = "envio_id")
    private Envio envio;
}
