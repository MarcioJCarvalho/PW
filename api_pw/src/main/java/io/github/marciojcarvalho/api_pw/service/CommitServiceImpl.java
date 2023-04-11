package io.github.marciojcarvalho.api_pw.service;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;
import io.github.marciojcarvalho.api_pw.entity.Commit;
import io.github.marciojcarvalho.api_pw.repository.CommitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CommitServiceImpl implements CommitService{
    private final CommitRepository commitRepository;
    @Override
    public CommitDTO cadastrar(CommitDTO commitDTO) {
        Commit commit = new Commit();
        commit = commit.converter(commitDTO);
        return commitDTO.converter(commitRepository.save(commit));
    }

    @Override
    public void excluir(Long id) {
        commitRepository.deleteById(id);
    }
}
