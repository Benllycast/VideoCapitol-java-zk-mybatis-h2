package com.webapp.videocapitol.peliculas;

import java.util.List;

public interface PeliculaMapper {
    List<PeliculaModel> findAll();
    void add(PeliculaModel pelicula);
    PeliculaModel find(long id);
}
