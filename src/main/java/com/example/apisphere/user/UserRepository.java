package com.example.apisphere.user;

import org.springframework.data.jpa.repository.JpaRepository;
// Tem que colocar qual é o objeto e o tipo da chave primaria (nos parametros abaixo)

public interface UserRepository extends JpaRepository<User, Long> {


}
