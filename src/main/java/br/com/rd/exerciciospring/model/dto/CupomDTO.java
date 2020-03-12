package br.com.rd.exerciciospring.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CupomDTO {

    private Long codCupom;
    private Long idCliente;
    private BigDecimal vlVenda;
}
