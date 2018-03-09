package com.webapp.videocapitol.reservas;

import java.io.Serializable;
import java.util.List;

import org.zkoss.bind.annotation.*;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;

import com.webapp.videocapitol.clientes.ClienteData;
import com.webapp.videocapitol.clientes.ClienteModel;
import com.webapp.videocapitol.clientes.ClienteService;
import com.webapp.videocapitol.peliculas.PeliculaData;
import com.webapp.videocapitol.peliculas.PeliculaModel;
import com.webapp.videocapitol.peliculas.PeliculaService;

public class NuevoViewModel implements Serializable {


    private static final long serialVersionUID = -3314202996544882282L;
    
    ReservaModel nuevoModelo;
    ClienteModel selectedCliente;
    PeliculaModel selectedPelicula;
    List<ClienteModel> clientes;
    List<PeliculaModel> peliculas;
    ListModelList<ClienteModel> lc;
    ListModelList<PeliculaModel> lp;
    
    int pickedCliente = -1;
    int pickedPelicula = -1;
    
    ClienteService sc = new ClienteData();
    PeliculaService sp = new PeliculaData();
    ReservaService sr = new ReservaData();

    public NuevoViewModel() {
        // TODO Auto-generated constructor stub
    }
    
    public ReservaModel getNuevoModelo() {
        return nuevoModelo;
    }

    public void setNuevoModelo(ReservaModel nuevoModelo) {
        this.nuevoModelo = nuevoModelo;
    }

    public ClienteModel getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(ClienteModel selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public PeliculaModel getSelectedPelicula() {
        return selectedPelicula;
    }

    public void setSelectedPelicula(PeliculaModel selectedPelicula) {
        this.selectedPelicula = selectedPelicula;
    }

    public int getPickedCliente() {
        return pickedCliente;
    }

    public void setPickedCliente(int pickedCliente) {
        this.pickedCliente = pickedCliente;
    }

    public int getPickedPelicula() {
        return pickedPelicula;
    }

    public void setPickedPelicula(int pickedPelicula) {
        this.pickedPelicula = pickedPelicula;
    }

    public List<ClienteModel> getClientes() {
        return clientes;
    }

    public List<PeliculaModel> getPeliculas() {
        return peliculas;
    }

    @Init
    void init() {
        clientes = sc.findAll();
        peliculas = sp.findAll();
        nuevoModelo = new ReservaModel();
        System.out.println("Reservas Nuevo: init");
    }
    
    @Command
    @NotifyChange("nuevoModelo")
    public void addNuevo() {
        nuevoModelo.setCliente(selectedCliente);
        nuevoModelo.setPelicula(selectedPelicula);
        sr.add(nuevoModelo);
        Messagebox.show("Reserva Registrada");
    }

}
