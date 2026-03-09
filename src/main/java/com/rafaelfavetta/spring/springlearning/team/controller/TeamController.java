package com.rafaelfavetta.spring.springlearning.team.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @PostMapping("/createTeam")
    public void createTeam() {
    }

    @PutMapping("/updateTeamById/{id}")
    public void updateTeamById() {
    }

    @GetMapping("/getAllTeams")
    public void getAllTeams() {
    }

    @GetMapping("/getTeamById/{id}")
    public void getTeamById() {
    }

    @DeleteMapping("/deleteTeamById/{id}")
    public void deleteTeamById() {
    }
}
