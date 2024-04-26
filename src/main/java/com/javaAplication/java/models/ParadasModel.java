package com.javaAplication.java.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.javaAplication.java.models.BusesViajesInfoModel;


@Entity
@Table(name = "paradas")
public class ParadasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @ManyToOne
    @JoinColumn(name = "identificador_bus")
    private BusesViajesInfoModel identificador_bus_id;

    @Column
    private String parada;

    // Getter para el campo id
    public Long getId() {
        return id;
    }


    // Getter para el campo identificador_bus_id
    public BusesViajesInfoModel getIdentificador_bus_id() {
        return identificador_bus_id;
    }

    // Setter para el campo identificador_bus_id
    public void setIdentificador_bus_id(BusesViajesInfoModel identificador_bus_id) {
        this.identificador_bus_id = identificador_bus_id;
    }

    // Getter para el campo parada
    public String getParada() {
        return parada;
    }

    // Setter para el campo parada
    public void setParada(String parada) {
        this.parada = parada;
    }
}
