package com.codenation.projeto.Evento.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private Level level;

    @Column
    private String description;

    @Column
    private String log;

    @Column
    private String source;

    @Column
    private LocalDate createdAt;

    @Column
    private long quantity;
}
