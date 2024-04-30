package com.javaAplication.java.models;

import com.javaAplication.java.models.BusesViajesInfoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "trayectos")
public class TrayectosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "identificador_bus")
    private BusesViajesInfoModel identificador_bus_id;

    private String trayecto;

    // Getter para el campo id
    public Long getId() {
        return id;
    }

    // Setter para el campo id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para el campo identificador_bus_id
    public BusesViajesInfoModel getIdentificador_bus_id() {
        return identificador_bus_id;
    }

    // Setter para el campo identificador_bus_id
    public void setIdentificador_bus_id(BusesViajesInfoModel identificador_bus_id) {
        this.identificador_bus_id = identificador_bus_id;
    }

    // Getter para el campo trayecto
    public String getTrayecto() {
        return trayecto;
    }

    // Setter para el campo trayecto
    public void setTrayecto(String trayecto) {
        this.trayecto = trayecto;
    }
}
