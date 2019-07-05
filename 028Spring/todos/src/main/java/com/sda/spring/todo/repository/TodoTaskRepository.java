package com.sda.spring.todo.repository;

import com.sda.spring.todo.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoTaskRepository extends JpaRepository<TodoTask, Long> {

//    @Query("Select from todotasks where addDate like '%?1%'")
//    public List<TodoTask> findByDate(String date);

}
