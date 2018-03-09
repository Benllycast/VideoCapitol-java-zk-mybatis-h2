package com.webapp.videocapitol.reservas;

import java.util.List;

public interface ReservaMapper {
    List<ReservaModel> findAll();
    void add(ReservaModel reserva);
    
}
