package com.webapp.videocapitol.reservas;

import java.util.Calendar;
import java.util.Date;

import com.webapp.videocapitol.clientes.ClienteData;
import com.webapp.videocapitol.clientes.ClienteModel;
import com.webapp.videocapitol.peliculas.PeliculaData;
import com.webapp.videocapitol.peliculas.PeliculaModel;

public class ReservaModel {
    
    Long id = -1L;
    Long clienteID;
    Long peliculaID;
    Date fechaHora;
    java.sql.Date _fechaHora;
    

    public ReservaModel() {
        // TODO Auto-generated constructor stub
        this.fechaHora = Calendar.getInstance().getTime();
        this._fechaHora = new java.sql.Date(this.fechaHora.getTime());
    }

    public ReservaModel(Long id, Long clienteID, Long peliculaID, Date fechaHora) {
        super();
        this.id = id;
        this.clienteID = clienteID;
        this.peliculaID = peliculaID;
        this.fechaHora = fechaHora;
        this._fechaHora = new java.sql.Date(this.fechaHora.getTime());
    }
    
    public ReservaModel(ClienteModel c, PeliculaModel p, Date fechaHora) {
        super();
        this.clienteID = c.getId();
        this.peliculaID = p.getId();
        this.fechaHora = fechaHora;
        this._fechaHora = new java.sql.Date(this.fechaHora.getTime());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteID() {
        return clienteID;
    }

    public void setClienteID(Long clienteID) {
        this.clienteID = clienteID;
    }

    public Long getPeliculaID() {
        return peliculaID;
    }

    public void setPeliculaID(Long peliculaID) {
        this.peliculaID = peliculaID;
    }

    public Date getFechaHora() {
        return fechaHora;
    }
    public java.sql.Date get_FechaHora(){
        return this._fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
        this._fechaHora.setTime(this.fechaHora.getTime());
    }
    
    public ClienteModel getCliente() {
        ClienteModel c = new ClienteModel();
        c.setId(this.getClienteID());
        return (new ClienteData()).find(c);
    }
    
    public void setCliente(ClienteModel c) {
        ClienteModel _c = (new ClienteData()).find(c);
        this.setClienteID(_c.getId());
    }
    
    public PeliculaModel getPelicula() {
        PeliculaModel p = new PeliculaModel();
        p.setId(this.getPeliculaID());
        return (new PeliculaData()).find(p);
    }
    
    public void setPelicula(PeliculaModel p) {
        PeliculaModel _p = (new PeliculaData()).find(p);
        this.setPeliculaID(_p.getId());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        if (!(obj instanceof ReservaModel)) {
            return false;
        }
        ReservaModel other = (ReservaModel) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
