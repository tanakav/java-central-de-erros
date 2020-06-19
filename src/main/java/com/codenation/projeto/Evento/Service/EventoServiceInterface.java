package com.codenation.projeto.Evento.Service;

import com.codenation.projeto.Evento.Entity.Evento;
import com.codenation.projeto.Evento.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface EventoServiceInterface {

    Evento getEvento();
}
