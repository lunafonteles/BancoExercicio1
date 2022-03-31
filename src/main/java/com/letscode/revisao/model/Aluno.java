package com.letscode.revisao.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Aluno {
    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataInscricao;

    public Aluno(UUID id, String nome, String email, String senha) {
    }
}
