package br.com.rd.exerciciospring.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long idCupomItem;

    @ManyToOne
    @JoinColumn(name = "cod_cupom")
    private Cupom cupom;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Column(name = "qtd_produto")
    private Long qtdProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;
}
