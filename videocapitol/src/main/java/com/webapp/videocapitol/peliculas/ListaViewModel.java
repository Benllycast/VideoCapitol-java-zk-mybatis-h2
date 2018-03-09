package com.webapp.videocapitol.peliculas;

import java.io.Serializable;
import java.util.List;

import org.zkoss.bind.annotation.Init;

public class ListaViewModel implements Serializable {

    private static final long serialVersionUID = -2740276161360819238L;

    PeliculaModel selectedPeliculaModel;
    PeliculaService service = new PeliculaData();
    List<PeliculaModel> peliculaListModel;
    
    public ListaViewModel() {
        // TODO Auto-generated constructor stub
    }
    
    public PeliculaModel getSelectedPeliculaModel() {
        return selectedPeliculaModel;
    }

    public void setSelectedPeliculaModel(PeliculaModel selectedPeliculaModel) {
        this.selectedPeliculaModel = selectedPeliculaModel;
    }


    public List<PeliculaModel> getPeliculaListModel() {
        return peliculaListModel;
    }

    public void setPeliculaListModel(List<PeliculaModel> peliculaListModel) {
        this.peliculaListModel = peliculaListModel;
    }

    @Init
    public void init() {
        peliculaListModel = service.findAll();
        System.out.println("peliculas:init");
    }

}
