package com.mensajeria.mensajeria;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
// Nombre de la tabla en la base de datos
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Elemento implements Identificable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
