package com.example.apisphere.user;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_jad_sphere_users")
@Data
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)//Essa anotação faz com que crie um id automaticamente
    Long id;
    String name;
    String bio;
    String email;
    String password;
    LocalDateTime createdAt; // indica quando a conta foi criada (Data de Criação)
    LocalDateTime updatedAt; // indica quando o registro foi altetado pelo ultima vez


}
