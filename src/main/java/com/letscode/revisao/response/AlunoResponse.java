package com.letscode.revisao.response;

import com.letscode.revisao.model.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class AlunoResponse {
    private UUID id;
    private String nome;
    private String email;
    private LocalDateTime dataInscricao;

    public AlunoResponse(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.dataInscricao = aluno.getDataInscricao();
    }
}
