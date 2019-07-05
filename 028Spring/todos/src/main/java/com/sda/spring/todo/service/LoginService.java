package com.sda.spring.todo.service;

import com.sda.spring.todo.model.AppUser;
import com.sda.spring.todo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // szukamy użytkownika w bazie
        Optional<AppUser> user = appUserRepository.findByEmail(email);
        if (user.isPresent()) {
            // jeśli go znajdziemy
            AppUser loggedInUser = user.get();

            // tworzymy usera (typ z frameworka spring) któremu dajemy nasze dane logowania
            // i dajemy prawa - każdy user ma prawa usera, a specjalny user ma prawa admina
            return new User(
                    loggedInUser.getEmail(),
                    loggedInUser.getPassword(),
                    getRoleOf(loggedInUser.getEmail()));
        }
        throw new UsernameNotFoundException("User nie istnieje!");
    }

    /**
     * Metoda zwraca role, zawsze zwraca role USER'a ale admina tylko dla konkretnego emaila.
     * @param email - email usera ktory sie loguje
     * @return
     */
    private Collection<? extends GrantedAuthority> getRoleOf(String email) {
        Set<GrantedAuthority> authorities = new HashSet<>();

        if (email.equals("admin@admin.admin")) {
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        return authorities;
    }
}
