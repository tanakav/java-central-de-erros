package com.codenation.projeto.Evento.Controller;

import com.codenation.projeto.Evento.Entity.Evento;
import com.codenation.projeto.Evento.Entity.Level;
import com.codenation.projeto.Evento.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public Page<Evento> findAll(@RequestParam(required=false) Level level, Pageable pageable){
        return eventoService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Evento getEventoById(@PathVariable Integer id){
        return eventoService.getEventoById(id);
    }
}
