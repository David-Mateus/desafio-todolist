package br.com.davidmateus.desafiotodolist.repository;

import br.com.davidmateus.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//Conexão com banco de dados
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
