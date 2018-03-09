package com.webapp.videocapitol.reservas;

import java.io.Serializable;
import java.util.List;

import org.zkoss.bind.annotation.*;

public class ListaViewModel implements Serializable {

    private static final long serialVersionUID = 1739341847464790752L;
    
    ReservaModel selectedReserva;
    List<ReservaModel> reservas;
    ReservaService service = new ReservaData();

    public ReservaModel getSelectedReserva() {
        return selectedReserva;
    }

    public void setSelectedReserva(ReservaModel selectesReserva) {
        this.selectedReserva = selectesReserva;
    }

    public List<ReservaModel> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaModel> reservas) {
        this.reservas = reservas;
    }

    public ListaViewModel() {
        // TODO Auto-generated constructor stub
    }
    
    @Init
    public void init(){
        reservas = service.findAll();
        System.out.println("Reservas:init");
    }

}
