package br.fullstack.escola.gerenciador.controller;

import br.fullstack.escola.gerenciador.model.AlunoModel;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("Alunos")
public class AlunoController {

    //Buscar todos
    @GetMapping
    public String get(){
        return "GET /cursos";
    }

    //Busca por ID
    @GetMapping("id")
    public String getID(@PathVariable Integer id){
        return "GET /cursos com o id: " + id;
    }



}
