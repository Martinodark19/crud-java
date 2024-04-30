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
@Table(name = "asientos")
public class AsientosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "identificador_bus")
    private BusesViajesInfoModel identificador_bus_id;

    @Column
    private int numero_asiento;

    @Column
    private String tipo_de_asiento;

    @Column
    private String estado_asiento;

    // Getters y setters para el campo id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter

    public BusesViajesInfoModel getIdentificador_bus_id() {
        return identificador_bus_id;
    }

    // setters
    public void setIdentificador_bus_id(BusesViajesInfoModel identificador_bus_id) {
        this.identificador_bus_id = identificador_bus_id;
    }

    // Getter
    public int getNumero_asiento() {
        return numero_asiento;
    }

    // setters
    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    // Getter
    public String getTipo_de_asiento() {
        return tipo_de_asiento;
    }

    // setters
    public void setTipo_de_asiento(String tipo_de_asiento) {
        this.tipo_de_asiento = tipo_de_asiento;
    }

    // Getter
    public String getEstado_asiento() {
        return estado_asiento;
    }

    // setters
    public void setEstado_asiento(String estado_asiento) {
        this.estado_asiento = estado_asiento;
    }
}