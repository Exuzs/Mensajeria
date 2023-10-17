package com.mensajeria.mensajeria;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "envios") // Nombre de la tabla en la base de datos
public class Envio extends Elemento {
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ciudad_origen_id")
    private Ciudad ciudadOrigen;

    @ManyToOne
    @JoinColumn(name = "ciudad_destino_id")
    private Ciudad ciudadDestino;

    @ManyToOne
    @JoinColumn(name = "estado_envio_id")
    private EstadoEnvio estadoEnvio;

    @OneToOne
    @JoinColumn(name = "paquete_id")
    private Paquete paquete;
}
