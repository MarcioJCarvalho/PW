package io.github.marciojcarvalho.api_pw.service;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;
import io.github.marciojcarvalho.api_pw.repository.CommitRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@Server
@RequiredArgsConstructor
public class CommitServiceImpl implements CommitService{
    private final CommitRepository commitRepository;
    @Override
    public CommitDTO cadastrar(CommitDTO commitDTO) {
        return null;
    }
}
