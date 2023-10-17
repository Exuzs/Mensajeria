package com.mensajeria.mensajeria;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_empleados") // Nombre de la tabla en la base de datos
public class TipoEmpleado extends Elemento {

}
