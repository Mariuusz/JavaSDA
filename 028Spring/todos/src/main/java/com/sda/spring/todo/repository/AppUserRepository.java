package com.sda.spring.todo.repository;

import com.sda.spring.todo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    // wywołuje zapytanie i zwraca wynik: fixme: Select count(*) from appuser where email=?1
    int countByEmail(String email);

    // wywołuje zapytanie i zwraca wynik: fixme: Select * from appuser where email=?1
    Optional<AppUser> findByEmail(String email);
}
