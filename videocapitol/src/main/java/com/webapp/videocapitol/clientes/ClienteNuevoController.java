package com.webapp.videocapitol.clientes;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

public class ClienteNuevoController extends ClienteControllerBase {
    
    private static final long serialVersionUID = -3043688825549935517L;
    
    @Wire("#frmCliente #txtRut")
    public Textbox txtRut;
    @Wire("#frmCliente #txtNombre")
    public Textbox txtNombre;
    @Wire("#frmCliente #txtDireccion")
    public Textbox txtDireccion;
    @Wire("#frmCliente #txtTelefono")
    public Textbox txtTelefono;

    public ClienteNuevoController() {
        // TODO Auto-generated constructor stub
        super();
    }
    
    @Listen("onClick = button#btnAceptar")
    public void onClickAceptar(Event evt) {
        System.out.println("presiono en aceptar:"+this.txtRut.getValue());
        String rut = (txtRut.getValue().isEmpty()) ? "123456" : txtRut.getValue();
        String nombre = (txtNombre.getValue().isEmpty()) ? "nombre" : txtNombre.getValue();
        String direccion = (txtDireccion.getValue().isEmpty()) ? "direccion" : txtDireccion.getValue();;
        String telefono = (txtTelefono.getValue().isEmpty()) ? "telefono" : txtTelefono.getValue();
        ClienteModel cm = new ClienteModel(rut, nombre, direccion, telefono);
        
        if (super.getData().add(cm) == 0) {
            Messagebox.show("Cliente agregado");
        }
    }

}
