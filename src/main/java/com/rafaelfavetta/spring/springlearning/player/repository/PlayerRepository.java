package com.rafaelfavetta.spring.springlearning.player.repository;

import com.rafaelfavetta.spring.springlearning.player.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<PlayerModel, UUID> {
}
