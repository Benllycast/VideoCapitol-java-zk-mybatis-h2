package com.webapp.videocapitol.peliculas;

import java.io.Serializable;

import org.zkoss.bind.annotation.*;
import org.zkoss.zul.Messagebox;

public class NuevoViewModel implements Serializable {

    private static final long serialVersionUID = -3842737550609329204L;

    PeliculaModel nuevoModelo;
    PeliculaService service = new PeliculaData();
    
    public NuevoViewModel() {
        // TODO Auto-generated constructor stub
    }
    
    public PeliculaModel getNuevoModelo() {
        return nuevoModelo;
    }

    public void setNuevoModelo(PeliculaModel nuevoModelo) {
        this.nuevoModelo = nuevoModelo;
    }
    @Init
    public void init() {
        nuevoModelo = new PeliculaModel("titulo",
                "Descripcion",
                "Actores",
                "Director",
                0);
        System.out.println("Peliculas Nueva: init");
    }

    @Command
    //@NotifyChange("nuevoModelo")
    public void addNuevo() {
        service.add(nuevoModelo);
        if (Messagebox.show("Pelicula agregada") > 0) {
            //Executions.sendRedirect("../pelicula/lista.zul");
        }
        
    }

}
