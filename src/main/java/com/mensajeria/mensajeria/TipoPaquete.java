package com.mensajeria.mensajeria;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_paquetes") // Nombre de la tabla en la base de datos
public class TipoPaquete extends Elemento {

}
