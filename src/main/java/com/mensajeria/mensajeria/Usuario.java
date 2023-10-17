package com.mensajeria.mensajeria;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "usuarios")
public class Usuario extends Elemento {
    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
