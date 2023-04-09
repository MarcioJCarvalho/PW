package io.github.marciojcarvalho.api_pw.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping(value = "/commits")
public class CommitController {

}
