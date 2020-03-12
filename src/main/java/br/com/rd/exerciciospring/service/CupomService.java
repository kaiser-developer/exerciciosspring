package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.dto.CupomDTO;
import br.com.rd.exerciciospring.model.entity.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("CupomService")
public class CupomService {

    @Autowired
    private CupomRepository repository;

    public ResponseEntity buscarCupom(Long idCliente, Date dtVenda){
        return ResponseEntity.ok().body(repository.findByIdClienteAndDtVenda(idCliente,dtVenda));
    }

    public ResponseEntity salvarCupom(CupomDTO cupomDTO){
        if(cupomDTO == null || cupomDTO.getIdCliente() == null)
            return ResponseEntity.ok().body(new Exception("Cliente não informado."));
        if(cupomDTO.getVlVenda() == null || cupomDTO.getVlVenda().floatValue() < 0  )
            return ResponseEntity.ok().body(new Exception(("Não foi possivel finalizar, valor não permitido")));

        Cupom cupom = new Cupom();
        cupom.setDtVenda(new Date());
        cupom.setIdCliente(cupomDTO.getIdCliente());
        cupom.setVlVenda(cupomDTO.getVlVenda());

        return ResponseEntity.ok().body(repository.save(cupom));
    }

    public List<Cupom> buscarTodos(){
        return repository.findAll();
    }
}
