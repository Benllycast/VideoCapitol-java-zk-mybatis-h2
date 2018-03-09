package com.webapp.videocapitol.clientes;

import java.io.Serializable;
import java.util.List;

import org.zkoss.bind.annotation.*;

public class ListaViewModel implements Serializable {

    private static final long serialVersionUID = -8079659199182797143L;

    ClienteModel selectedClienteModel;
    ClienteService service = new ClienteData();
    List<ClienteModel> clienteListModel;

    public ListaViewModel() {
    }
    

    public ClienteModel getSelectedClienteModel() {
        return selectedClienteModel;
    }


    public void setSelectedClienteModel(ClienteModel selectedClienteModel) {
        this.selectedClienteModel = selectedClienteModel;
    }


    public List<ClienteModel> getClienteListModel() {
        return clienteListModel;
    }


    public void setClienteListModel(List<ClienteModel> clienteListModel) {
        this.clienteListModel = clienteListModel;
    }


    @Init
    public void init() {
        //List<ClienteModel> list = service.getClienteList();
        clienteListModel = service.findAll(); // new ListModelList<ClienteModel>(list);
        System.out.println(clienteListModel.size());
    }

}
