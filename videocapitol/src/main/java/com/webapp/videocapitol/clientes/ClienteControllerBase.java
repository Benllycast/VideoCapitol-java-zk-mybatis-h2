package com.webapp.videocapitol.clientes;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;

public abstract class ClienteControllerBase extends SelectorComposer<Component> {

    private static final long serialVersionUID = -177383043851772291L;
    
    private ClienteData data = null;
    
    public ClienteControllerBase() {
        super();
        this.data = new ClienteData();
        
    }

    /**
     * @return the data
     */
    public ClienteData getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(ClienteData data) {
        this.data = data;
    }
    
    

}
