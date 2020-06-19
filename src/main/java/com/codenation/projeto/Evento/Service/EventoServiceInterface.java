package com.codenation.projeto.Evento.Service;

import com.codenation.projeto.Evento.Entity.Evento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface EventoServiceInterface {

    Evento getEventoById(Integer id);

    Page<Evento> findAll(Pageable pageable);
}
