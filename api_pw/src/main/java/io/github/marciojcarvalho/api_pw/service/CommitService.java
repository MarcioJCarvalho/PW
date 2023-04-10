package io.github.marciojcarvalho.api_pw.service;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;
import org.springframework.http.ResponseEntity;

public interface CommitService {
    CommitDTO cadastrar(CommitDTO commitDTO);
}
