package io.github.marciojcarvalho.api_pw.controller.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "commit")
public class Commit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dono;
    private String repositorio;
    @Column(name = "data_inicial")
    private LocalDateTime dataInicial;
    @Column(name = "data_final")
    private LocalDateTime dataFinal;
}
