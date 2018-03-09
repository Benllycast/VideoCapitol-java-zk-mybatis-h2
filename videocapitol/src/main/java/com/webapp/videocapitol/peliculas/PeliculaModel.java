package com.webapp.videocapitol.peliculas;

public class PeliculaModel {
    long id = -1L;
    String titulo = "";
    String descripcion = "";
    String actores = "";
    String director = "";
    int inventario = 0;

    public PeliculaModel() {
        // TODO Auto-generated constructor stub
    }
    

    public PeliculaModel(long id, String titulo, String descripcion, String actores, String director, int inventario) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.actores = actores;
        this.director = director;
        this.inventario = inventario;
    }


    public PeliculaModel(String titulo, String descripcion, String actores, String director, int inventario) {
        super();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.actores = actores;
        this.director = director;
        this.inventario = inventario;
    }



    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof PeliculaModel)) {
            return false;
        }
        PeliculaModel other = (PeliculaModel) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    
}
