package com.rafaelfavetta.spring.springlearning.player.model;

import com.rafaelfavetta.spring.springlearning.team.model.TeamModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_players")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String surname;
    private int age;

    @Column(unique = true)
    private int athleteNumber;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamModel team;
}
