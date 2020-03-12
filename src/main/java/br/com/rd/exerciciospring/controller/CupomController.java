package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.dto.CupomDTO;
import br.com.rd.exerciciospring.model.entity.Cupom;
import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    private CupomService service;

    @GetMapping("/buscar-cupons/{idCliente}/{dtVenda}")
    public ResponseEntity buscarCupons(@PathVariable("idCliente") Long idCliente, @PathVariable("dtVenda") Date dtVenda){
        return service.buscarCupom(idCliente, dtVenda);
    }

    @PostMapping("create-cupom")
    public ResponseEntity criarCupom(@RequestBody CupomDTO cupom){
        return service.salvarCupom(cupom);
    }

    @GetMapping("/todosCupons")
    public List<Cupom> buscarTodosCupons(){
        return service.buscarTodos();
    }
}
