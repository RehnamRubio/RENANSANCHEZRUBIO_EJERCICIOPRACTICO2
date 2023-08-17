
package com.Examen2.Examen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Prereservas")
//Codigo para la entidad Prereservas
public class Prereservas {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_vuelo") //Se llama a la tabla vuelos
    private Vuelos id_vuelo;
    @ManyToOne
    @JoinColumn(name = "id_cliente") //Se llama a la tabla clientes
    private Cliente id_cliente;
}
