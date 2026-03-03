package com.rafaelfavetta.spring.springlearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "tb_players")

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String surname;
    private int age;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamModel team;
}
