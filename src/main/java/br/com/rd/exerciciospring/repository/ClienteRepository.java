package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByEmailAndSenha(String email, String senha);
}
