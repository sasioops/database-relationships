package com.example.databaserelationships.service;

import com.example.databaserelationships.onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.databaserelationships.repository.PlayerProfileRepository;

import java.util.List;


@Service
public class PlayerProfileService {
    @Autowired
    PlayerProfileRepository repo;

    public List<PlayerProfile> allPlayerProfiles() {
        return repo.findAll();
    }

    public PlayerProfile getPlayerProfile(int id){
        return repo.findById(id).get();
    }

    public PlayerProfile addPlayerProfile(PlayerProfile profile) {
        profile.setId(0);
        return repo.save(profile);
    }

    public void deletePlayerProfile(int id) {
        repo.deleteById(id);
    }

}
