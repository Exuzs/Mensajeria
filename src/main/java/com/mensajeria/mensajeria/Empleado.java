package com.mensajeria.mensajeria;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados") // Nombre de la tabla en la base de datos
public class Empleado extends Persona {
    @ManyToOne
    @JoinColumn(name = "tipo_empleado_id")
    private TipoEmpleado tipoEmpleado;
}
