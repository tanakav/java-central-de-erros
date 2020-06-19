package com.codenation.projeto.Evento.Repository;

import com.codenation.projeto.Evento.Entity.Evento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento,Integer> {
    Page<Evento> findAll(Pageable pageable);
}
