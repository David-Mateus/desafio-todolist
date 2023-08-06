package br.com.davidmateus.desafiotodolist.service;

import br.com.davidmateus.desafiotodolist.entity.Todo;
import br.com.davidmateus.desafiotodolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.SortedMap;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return  list();
    }
    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return  list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return  list();
    }
}
