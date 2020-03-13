package br.com.rd.exerciciospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cliente")
    private Long codCliente;

    @Column(name = "ds_nome")
    private String nomeCompleto;

    @Column(unique = true, name = "ds_email")
    private String email;

    @Column(unique = true, name = "ds_cpf")
    private String cpf;

    @Column(name = "ds_telefone")
    private String telefone;

    @Column(name = "ds_senha")
    private String senha;
}
