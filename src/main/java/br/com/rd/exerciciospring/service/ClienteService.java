package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.dto.ClienteDTO;
import br.com.rd.exerciciospring.model.entity.Cliente;
import br.com.rd.exerciciospring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClienteService")
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente criarCliente(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();

        cliente.setCpf(clienteDTO.getCpf());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setNomeCompleto(clienteDTO.getNomeCompleto());
        cliente.setSenha(clienteDTO.getSenha());
        cliente.setTelefone(clienteDTO.getTelefone());
        return repository.save(cliente);
    }
}
