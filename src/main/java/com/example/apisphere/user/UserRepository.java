package com.example.apisphere.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// Tem que colocar qual é o objeto e o tipo da chave primaria (nos parametros abaixo)

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
