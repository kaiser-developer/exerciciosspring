package br.com.rd.exerciciospring.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String nomeCompleto;
    private String email;
    private String cpf;
    private String telefone;
    private String senha;
}
