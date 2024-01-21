package net.jenske.todo.controller;

import net.jenske.todo.exception.TodoNotFoundException;
import net.jenske.todo.model.Todo;
import net.jenske.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Comment to test CI/CD pipeline
@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id).orElseThrow(() -> new TodoNotFoundException("Todo not found with id: " + id));
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        if (!todo.getId().equals(id) || !todoService.existsById(id)) {
            throw new TodoNotFoundException("Todo not found with id: " + id);
        }
        return todoService.updateTodo(todo);
    }


    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        if (!todoService.existsById(id)) {
            throw new TodoNotFoundException("Todo not found with id: " + id);
        }
        todoService.deleteTodo(id);
    }


}
