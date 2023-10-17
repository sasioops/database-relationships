package com.example.databaserelationships.service;

import com.example.databaserelationships.onetoone.Player;
import com.example.databaserelationships.onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.databaserelationships.repository.PlayerRepository;

import java.util.Collections;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository repository;

    public List<Player> allPlayers(){
        return repository.findAll();
    }

   public  Player getPlayer(int playerid){
     return repository.findById(playerid).get();

    }

    public Player addPlayer(Player player){
        player.setId(0);
        return repository.save(player);

    }

    public void deletePlayer(int id){
        repository.deleteById(id);
    }

    public Player assignProfile(int playerid, PlayerProfile playerProfile){
        Player player = repository.findById(playerid).get();
        player.setPlayerProfile(playerProfile);
        return repository.save(player);
    }


}
