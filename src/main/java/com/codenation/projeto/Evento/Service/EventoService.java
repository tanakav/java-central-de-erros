package com.codenation.projeto.Evento.Service;

import com.codenation.projeto.Evento.Entity.Evento;
import com.codenation.projeto.Evento.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class EventoService implements EventoServiceInterface{

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento getEventoById(Integer id) {
        return eventoRepository.findById(id).orElse(new Evento());
    }

    @Override
    public Page<Evento> findAll(Pageable pageable) {
        return eventoRepository.findAll(pageable);
    }


}
