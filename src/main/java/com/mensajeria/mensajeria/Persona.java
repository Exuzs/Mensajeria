package com.mensajeria.mensajeria;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "personas") // Nombre de la tabla en la base de datos
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona extends Elemento implements Nombrable, ConDireccion {
    private String nombre;
    private String direccion;
}
