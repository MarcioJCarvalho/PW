package io.github.marciojcarvalho.api_pw.controller;

import io.github.marciojcarvalho.api_pw.controller.dto.CommitDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Data
@RequiredArgsConstructor
@RestController
@RequestMapping( "/commits")
public class CommitController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "teste")
    public void cadastrar(@RequestBody CommitDTO commitDTO){
        commitDTO.toString();
    }
}
