package dev.cami.todolistapp.service;

import dev.cami.todolistapp.model.TodoItem;
import dev.cami.todolistapp.repository.TodoItemRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public record TodoItemService(
    TodoItemRepository todoItemRepository,
    TodoListService todoListService
) {

  public TodoItem createTodoItem(TodoItem todoItem) {
   return todoItemRepository.save(todoItem);
  }

  public TodoItem getTodoItem(UUID id) {
    return todoItemRepository.findById(id).orElseThrow(
        () -> new IllegalArgumentException("Todo item with id " + id + " does not exist.")
    );
  }

  public void deleteTodoItem(UUID id) {
    todoItemRepository.deleteById(id);
  }

  public TodoItem updateTodoItem(TodoItem todoItem) {
    TodoItem existingTodoItem = getTodoItem(todoItem.getId());
    existingTodoItem.setDescription(todoItem.getDescription());
    existingTodoItem.setCompleted(todoItem.isCompleted());
    return todoItemRepository.save(existingTodoItem);
  }

  public TodoItem markTodoItemCompleted(UUID id) {
    TodoItem existingTodoItem = getTodoItem(id);
    existingTodoItem.setCompleted(true);
    return todoItemRepository.save(existingTodoItem);
  }
}
