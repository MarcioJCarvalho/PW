package io.github.marciojcarvalho.api_pw.dto;

import io.github.marciojcarvalho.api_pw.entity.Commit;
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
public class CommitDTO {
    private Long id;
    private String dono;
    private String repositorio;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;

    public CommitDTO converter(Commit commit){
        BeanUtils.copyProperties(commit, this);
        return this;
    }

    public  List<CommitDTO> converterParaLista(List<Commit> commitList){
        CommitDTO commitDTO = new CommitDTO();
        List<CommitDTO> commitDTOList = new ArrayList<>();
        commitList.forEach(commitItem ->{
            commitDTOList.add(commitDTO.converter(commitItem));
        });
        return commitDTOList;
    }
}
