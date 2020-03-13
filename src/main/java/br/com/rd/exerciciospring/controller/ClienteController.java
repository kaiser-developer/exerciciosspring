package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.dto.ClienteDTO;
import br.com.rd.exerciciospring.model.entity.Cliente;
import br.com.rd.exerciciospring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping("criar-cliente")
    public Cliente criarCliente(@RequestBody ClienteDTO clienteDTO){
        return service.criarCliente(clienteDTO);
    }

    @PostMapping("login-cliente")
    public Cliente realizarLogin(@RequestBody String[] dados){
        return service.fazerLogin(dados[0], dados[1]);
    }
}
