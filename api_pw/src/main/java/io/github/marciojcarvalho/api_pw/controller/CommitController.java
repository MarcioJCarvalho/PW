package io.github.marciojcarvalho.api_pw.controller;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;
import io.github.marciojcarvalho.api_pw.repository.CommitRepository;
import io.github.marciojcarvalho.api_pw.service.CommitServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Data
@RequiredArgsConstructor
@RestController
@RequestMapping( "/commits")
public class CommitController {

    private final CommitServiceImpl commitService;
    @PostMapping
    public ResponseEntity<CommitDTO> cadastrar(@RequestBody CommitDTO commitDTO){
        return new ResponseEntity<>(commitService.cadastrar(commitDTO), HttpStatus.CREATED);
    }
}
