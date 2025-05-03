package com.learning.productservices.repository;

import com.learning.productservices.model.entities.TblTodos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TblTodos, Long> {
}
