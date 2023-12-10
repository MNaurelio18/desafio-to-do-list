package br.com.marcoaurelio.todolist.repository;

import br.com.marcoaurelio.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
