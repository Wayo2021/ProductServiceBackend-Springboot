package com.learning.productservices.service.todos;

import com.learning.productservices.model.dto.TodoDto;

public interface ITodoServices {

    TodoDto completeTodo(Long id);

}
