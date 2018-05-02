package com.webapp.videocapitol.test;

import java.math.BigDecimal;

public class TeoriaCaso {
    private BigDecimal id;
    private String nombrePersonaCaso;
    private String descBienElemento;
    private String teoria;
    private String resumen;

    public TeoriaCaso() {
        // TODO Auto-generated constructor stub
    }

    public TeoriaCaso(BigDecimal id, String nombrePersonaCaso, String descBienElemento, String teoria, String resumen) {
        super();
        this.id = id;
        this.nombrePersonaCaso = nombrePersonaCaso;
        this.descBienElemento = descBienElemento;
        this.teoria = teoria;
        this.resumen = resumen;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombrePersonaCaso() {
        return nombrePersonaCaso;
    }

    public void setNombrePersonaCaso(String nombrePersonaCaso) {
        this.nombrePersonaCaso = nombrePersonaCaso;
    }

    public String getDescBienElemento() {
        return descBienElemento;
    }

    public void setDescBienElemento(String descBienElemento) {
        this.descBienElemento = descBienElemento;
    }

    public String getTeoria() {
        return teoria;
    }

    public void setTeoria(String teoria) {
        this.teoria = teoria;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

}
