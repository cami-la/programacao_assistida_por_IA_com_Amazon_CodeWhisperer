package dev.cami.todolistapp.service;

import dev.cami.todolistapp.model.TodoList;
import dev.cami.todolistapp.repository.TodoListRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TodoListServiceTest {
  @Mock
  private TodoListRepository todoListRepository;
  @InjectMocks
  private TodoListService todoListService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void should_createTodoList() {
    //given
    TodoList fakeTodoList = TodoList.builder()
        .id(UUID.randomUUID())
        .title("fake title")
        .build();
    Mockito.when(todoListRepository.save(Mockito.any())).thenReturn(fakeTodoList);

    //when
    TodoList actual = todoListService.createTodoList(fakeTodoList);

    //then
    Assertions.assertThat(actual).isEqualTo(fakeTodoList);
    Assertions.assertThat(actual.getItems()).isNullOrEmpty();
  }

  @Test
  void should_getTodoListById() {
    //given
    UUID fakeId = UUID.randomUUID();
    TodoList fakeTodoList = TodoList.builder()
        .id(fakeId)
        .title("fake title")
        .build();
    Mockito.when(todoListRepository.findById(fakeId)).thenReturn(Optional.of(fakeTodoList));

    //when
    TodoList actual = todoListService.getTodoList(fakeId);

    //then
    Assertions.assertThat(actual).isEqualTo(fakeTodoList);
    Assertions.assertThat(actual.getItems()).isNullOrEmpty();
  }

  @Test
  void should_getAllTodoLists() {
    //given
    TodoList fakeTodoList = TodoList.builder()
        .id(UUID.randomUUID())
        .title("fake title")
        .build();
    TodoList fakeTodoList2 = TodoList.builder()
        .id(UUID.randomUUID())
        .title("fake title 2")
        .build();
    Mockito.when(todoListRepository.findAll()).thenReturn(List.of(fakeTodoList, fakeTodoList2));

    //when
    List<TodoList> actual = todoListService.getAllTodoLists();

    //then
    Assertions.assertThat(actual).contains(fakeTodoList);
    Assertions.assertThat(actual).contains(fakeTodoList2);
    Assertions.assertThat(actual).hasSize(2);
  }

  @Test
  void should_updateTodoList() {
    //given
    UUID fakeId = UUID.randomUUID();
    TodoList oldFakeTodoList = TodoList.builder()
        .id(fakeId)
        .title("Old fake title")
        .build();
    TodoList updatedTodoList = TodoList.builder()
        .id(fakeId)
        .title("Updated fake title")
        .build();
    Mockito.when(todoListRepository.findById(fakeId)).thenReturn(Optional.of(oldFakeTodoList));
    Mockito.when(todoListRepository.save(Mockito.any())).thenReturn(updatedTodoList);

    //when
    TodoList actual = todoListService.updateTodoList(fakeId, updatedTodoList);

    //then
    Assertions.assertThat(actual).isEqualTo(updatedTodoList);
    Assertions.assertThat(actual.getItems()).isNullOrEmpty();
  }

  //create a test method for deleteTodoList()

  @Test
  void should_deleteTodoList() {
    // Given
    UUID fakeId = UUID.randomUUID();
    TodoList fakeTodoList = TodoList.builder()
        .id(fakeId)
        .title("Fake title")
        .build();

    // When
    Mockito.when(todoListRepository.findById(fakeId)).thenReturn(Optional.of(fakeTodoList));
    Mockito.doNothing().when(todoListRepository).deleteById(fakeId);
    todoListService.deleteTodoList(fakeId);

    // Then
    Mockito.verify(todoListRepository, Mockito.times(1)).deleteById(fakeId);
  }
}

