package com.webapp.videocapitol.clientes;

import java.util.List;

public interface ClienteMapper {
    
    List<ClienteModel> findAll();
    
    void add(ClienteModel cliente);
    
    ClienteModel find(long id);

}
