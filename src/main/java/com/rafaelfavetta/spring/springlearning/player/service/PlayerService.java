package com.rafaelfavetta.spring.springlearning.player.service;

import com.rafaelfavetta.spring.springlearning.player.model.PlayerModel;
import com.rafaelfavetta.spring.springlearning.player.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<PlayerModel> getAllPlayers() {
        return playerRepository.findAll();
    }

    public PlayerModel getPlayerById(UUID id) {
        return playerRepository.findById(id).orElse(null);
    }

    public PlayerModel createPlayer(PlayerModel player) {
        return playerRepository.save(player);
    }

    public PlayerModel updatePlayer(UUID id, PlayerModel player) {
        PlayerModel existingPlayer = playerRepository.findById(id).orElse(null);
        if (existingPlayer != null) {
            existingPlayer.setName(player.getName());
            existingPlayer.setAge(player.getAge());
            existingPlayer.setSurname(player.getSurname());
            existingPlayer.setAthleteNumber(player.getAthleteNumber());
            existingPlayer.setTeam(player.getTeam());
            return playerRepository.save(existingPlayer);
        }
        return null;
    }

    public void deletePlayer(UUID id) {
        playerRepository.deleteById(id);
    }
}
