package com.codenation.projeto.Evento.Repository;

import com.codenation.projeto.Evento.Entity.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento,Integer> {
}
