package com.rafaelfavetta.spring.springlearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_teams")

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private String name;
    private Conference conference;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<PlayerModel> players;
}