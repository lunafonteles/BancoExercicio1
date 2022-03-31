package com.letscode.revisao.request;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class AlunoRequest {
    @NotEmpty @NotNull @Size(min = 2)
    private String nome;
    @Email
    private String email;
    @NotEmpty @NotNull
    private String senha;
}
