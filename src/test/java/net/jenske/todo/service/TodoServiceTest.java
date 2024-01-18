package net.jenske.todo.service;

import net.jenske.todo.model.Todo;
import net.jenske.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TodoServiceTest {

    @MockBean
    private TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @Test
    public void whenValidId_thenTodoShouldBeFound() {
        // Setup mock repository
        Long id = 1L;
        Todo testTodo = new Todo();
        testTodo.setId(id);
        when(todoRepository.findById(id)).thenReturn(Optional.of(testTodo));

        // Execute the service call
        Optional<Todo> found = todoService.getTodoById(id);

        // Assert the response
        assertTrue(found.isPresent());
        assertEquals(found.get().getId(), id);
    }

    @Test
    public void whenInvalidId_thenTodoShouldNotBeFound() {
        Long invalidId = 99L; // An ID that does not exist
        when(todoRepository.findById(invalidId)).thenReturn(Optional.empty());

        Optional<Todo> result = todoService.getTodoById(invalidId);

        assertFalse(result.isPresent()); // Assert that no Todo is found
    }
}
