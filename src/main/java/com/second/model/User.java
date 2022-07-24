package com.second.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "public")
//@Table(name = "user", schema = "public")

public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
//    @SequenceGenerator(name = "user_seq", sequenceName = "user_username_seq")

    private String username;
    private UUID id;

    public User() {
    }

    public User(UUID id, String username) {
        this.username = username;
        this.id = id;
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public UUID getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

