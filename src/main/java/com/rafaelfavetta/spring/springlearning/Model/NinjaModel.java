package com.rafaelfavetta.spring.springlearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")

@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private String name;
    private String email;
    private int age;

}
