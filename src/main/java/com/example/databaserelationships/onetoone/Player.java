package com.example.databaserelationships.onetoone;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Player  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private PlayerProfile playerProfile;

    public Player(int id, String name) {
        id = id;
        this.name = name;
    }

    public Player(int id) {
        id = id;
    }

    public Player(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    public Player(String name, PlayerProfile playerProfile) {
        this.name = name;
        this.playerProfile = playerProfile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
