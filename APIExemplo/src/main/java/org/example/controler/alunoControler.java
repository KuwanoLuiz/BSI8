package org.example.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aluno")

public class alunoControler {

    @GetMapping("teste")
    public String teste(){
        return "HELLO WORD";
    }
}
