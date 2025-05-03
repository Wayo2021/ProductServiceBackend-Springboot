package com.learning.productservices.controller;

import com.learning.productservices.model.dto.TodoDto;
import com.learning.productservices.service.todos.ITodoServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
@AllArgsConstructor
public class TodoController {

//    model
//    repository
//    DTO
//    Exception
//    Service
//    impl
//    controller


    @Autowired
    private ITodoServices todoService;

    //-----------------------------------------------------------------------------------patch by id
    @PatchMapping("/{id}")
    public ResponseEntity<TodoDto> completeTodo(@PathVariable("id") Long todoId) {

        TodoDto updateTodo = todoService.completeTodo(todoId);

        return ResponseEntity.ok(updateTodo);
    }
}
