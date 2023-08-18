package com.api.SpringBootADA.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="users")
@Entity
@Data
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;
    private String email;
    private String password;



}
