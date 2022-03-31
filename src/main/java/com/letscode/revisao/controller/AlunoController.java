package com.letscode.revisao.controller;

import com.letscode.revisao.model.Aluno;
import com.letscode.revisao.request.AlunoRequest;
import com.letscode.revisao.response.AlunoResponse;
import com.letscode.revisao.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoResponse> createAluno(
            @RequestBody @Valid AlunoRequest alunoRequest,
            UriComponentsBuilder uriComponentsBuilder) {
        Aluno aluno = alunoService.cadastrarAluno(alunoRequest);
        URI uri = uriComponentsBuilder.path("/cliente/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).body(new AlunoResponse(aluno));
    }

    @GetMapping
    public Aluno getAlunos(){
        Aluno aluno = new Aluno(UUID.randomUUID(), "luna", "luna@teste.com", "4534534");
        return aluno;
    }

    /*@PutMapping
    public ResponseEntity<AlunoResponse> updateAluno(
            @RequestBody AlunoRequest alunoRequest,
            UriComponentsBuilder uriComponentsBuilder) {
         {
            Aluno aluno = alunoService.atualizarAluno(alunoRequest);

            URI uri = uriComponentsBuilder.path("/cliente/{id}").buildAndExpand(aluno.getId()).toUri();
            return ResponseEntity.ok(uri).body(new AlunoResponse(aluno));
        }
    }*/
}
