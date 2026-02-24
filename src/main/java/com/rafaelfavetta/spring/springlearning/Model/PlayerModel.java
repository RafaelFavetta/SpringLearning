package com.rafaelfavetta.spring.springlearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private String name;
    private String surname;
    private int age;
}
