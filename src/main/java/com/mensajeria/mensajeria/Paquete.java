package com.mensajeria.mensajeria;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paquetes") // Nombre de la tabla en la base de datos
public class Paquete extends Elemento {

}
