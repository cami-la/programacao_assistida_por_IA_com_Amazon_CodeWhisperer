package dev.cami.todolistapp.service;

import dev.cami.todolistapp.model.TodoList;
import dev.cami.todolistapp.repository.TodoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public record TodoListService(
    TodoListRepository todoListRepository
) {

  public TodoList createTodoList(TodoList todoList) {
    return todoListRepository.save(todoList);
  }

  public TodoList getTodoList(UUID id) {
    return todoListRepository.findById(id).orElseThrow(
        () -> new IllegalStateException("TodoList with id " + id + " does not exist.")
    );
  }

  public List<TodoList> getAllTodoLists() {
    return todoListRepository.findAll();
  }

  public TodoList updateTodoList(UUID id, TodoList todoList) {
    TodoList existingTodoList = getTodoList(id);
    existingTodoList.setTitle(todoList.getTitle());
    return todoListRepository.save(existingTodoList);
  }

  public void deleteTodoList(UUID id) {
    todoListRepository.deleteById(id);
  }
}
