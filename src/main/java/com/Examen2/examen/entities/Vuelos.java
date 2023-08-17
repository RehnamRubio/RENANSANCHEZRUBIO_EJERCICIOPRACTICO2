
package com.Examen2.Examen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "Vuelos")
//Se crea la entidad vuelos
public class Vuelos implements Serializable{
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numero_vuelo;
    private String destino;
    private String lugar_salida;
    private Time hora_salida;
    private Date fecha_salida;
    private Date fecha_llegada;
    private String modelo_avion;
}
