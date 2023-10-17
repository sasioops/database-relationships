package com.example.databaserelationships.repository;

import com.example.databaserelationships.onetoone.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository <Player, Integer> {


}
