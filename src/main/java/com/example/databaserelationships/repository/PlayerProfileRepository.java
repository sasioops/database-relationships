package com.example.databaserelationships.repository;

import com.example.databaserelationships.onetoone.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository <PlayerProfile, Integer> {

}
