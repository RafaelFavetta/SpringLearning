package com.rafaelfavetta.spring.springlearning.player.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @PostMapping("/createPlayer")
    public void createPlayer() {
    }

    @GetMapping("/getAllPlayers")
    public void getAllPlayers() {
    }

    @GetMapping("/getPlayerById/{id}")
    public void getPlayerById() {
    }

    @PutMapping("/updatePlayerById/{id}")
    public void updatePlayerById() {
    }

    @DeleteMapping("/deletePlayerById/{id}")
    public void deletePlayerById() {
    }
}
