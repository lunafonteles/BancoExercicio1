package com.letscode.revisao.service;

import com.letscode.revisao.model.Aluno;
import com.letscode.revisao.request.AlunoRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AlunoService {
    public Aluno cadastrarAluno(AlunoRequest alunoRequest) {
        Aluno aluno = new Aluno(
                UUID.randomUUID(),
                alunoRequest.getNome(),
                alunoRequest.getEmail(),
                alunoRequest.getSenha(),
                LocalDateTime.now()
        );
        return aluno;
    }

/*    public Aluno atualizarAluno() {
        return null;
        }*/
}
