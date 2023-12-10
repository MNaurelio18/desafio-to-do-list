package br.com.marcoaurelio.todolist.controller;

import br.com.marcoaurelio.todolist.entity.Todo;
import br.com.marcoaurelio.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    List<Todo> create(Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PutMapping
    List<Todo> update(Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping
    List<Todo> delete(Long id) {
        return todoService.delete(id);
    }


}
