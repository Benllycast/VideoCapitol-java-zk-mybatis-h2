package com.webapp.videocapitol.clientes;

public class ClienteModel {
    
    private long id = -1L;
    private String rut="";
    private String nombre="";
    private String direccion="";
    private String telefono="";

    public ClienteModel() {
        // TODO Auto-generated constructor stub
    }
    
    public ClienteModel(long id, String rut, String nombre, String direccion, String telefono) {
        super();
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public ClienteModel(String rut, String nombre, String direccion, String telefono) {
        super();
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        if (!(obj instanceof ClienteModel)) {
            return false;
        }
        ClienteModel other = (ClienteModel) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    
}
