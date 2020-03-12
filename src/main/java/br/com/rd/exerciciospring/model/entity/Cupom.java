package br.com.rd.exerciciospring.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cupom")
    private Long codCupom;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "dt_venda")
    private Date dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;
}
