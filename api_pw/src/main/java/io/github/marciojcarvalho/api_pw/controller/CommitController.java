package io.github.marciojcarvalho.api_pw.controller;

import io.github.marciojcarvalho.api_pw.dto.CommitDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Data
@RequiredArgsConstructor
@RestController
@RequestMapping( "/commits")
public class CommitController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void cadastrar(@RequestBody CommitDTO commitDTO){
    }
}
