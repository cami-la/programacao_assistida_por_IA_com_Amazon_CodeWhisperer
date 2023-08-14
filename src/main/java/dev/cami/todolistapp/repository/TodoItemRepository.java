package dev.cami.todolistapp.repository;

import dev.cami.todolistapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, UUID> {
}
