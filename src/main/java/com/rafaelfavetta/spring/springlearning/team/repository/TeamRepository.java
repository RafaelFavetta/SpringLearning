package com.rafaelfavetta.spring.springlearning.team.repository;

import com.rafaelfavetta.spring.springlearning.team.model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeamRepository extends JpaRepository<TeamModel, UUID> {
}
