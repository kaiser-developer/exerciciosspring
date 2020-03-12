package br.com.rd.exerciciospring.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CupomItemDTO {
    private Long idCupomItem;
    private Long idCupom;
    private Long idProduto;
    private Long qtdProduto;
    private BigDecimal vlProduto;
}
