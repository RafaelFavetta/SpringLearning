package com.rafaelfavetta.spring.springlearning.team.model;

import com.rafaelfavetta.spring.springlearning.player.model.PlayerModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_teams")

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Conference conference;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<PlayerModel> players;
}