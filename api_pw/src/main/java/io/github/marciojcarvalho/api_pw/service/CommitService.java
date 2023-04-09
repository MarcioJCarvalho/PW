package io.github.marciojcarvalho.api_pw.service;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;

public interface CommitService {
    void cadastrar(CommitDTO commitDTO);
}
