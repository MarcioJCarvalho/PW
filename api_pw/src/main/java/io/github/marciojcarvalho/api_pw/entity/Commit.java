package io.github.marciojcarvalho.api_pw.entity;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    public Commit converter(CommitDTO commitDTO){
        BeanUtils.copyProperties(commitDTO, this);
        return this;
    }

    public List<Commit> converterParaLista(List<CommitDTO> commitDTOList){
        Commit commit = new Commit();
        List<Commit> commitList = new ArrayList<>();
        commitDTOList.forEach(commitItem ->{
            commitList.add(commit.converter(commitItem));
        });
        return commitList;
    }
}
