package com.learning.productservices.service.todos.todoServiceImpl;

import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.TodoDto;
import com.learning.productservices.model.entities.TblTodos;
import com.learning.productservices.repository.TodoRepository;
import com.learning.productservices.service.todos.TodoAbstract;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoService extends TodoAbstract {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoDto completeTodo(Long id) {

        TblTodos tblTodos = todoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo not found with id : " + id));
        tblTodos.setCompleted(Boolean.TRUE);

        TblTodos updateTblTodos = todoRepository.save(tblTodos);

        return mapToTodoDto(updateTblTodos);
    }

    private TodoDto mapToTodoDto(TblTodos tblTodos) {

        TodoDto todoDto = new TodoDto();
        todoDto.setId(tblTodos.getId());
        todoDto.setTitle(tblTodos.getTitle());
        todoDto.setDescription(tblTodos.getDescription());
        todoDto.setCompleted(tblTodos.isCompleted());

        return todoDto;
    }
}
