package com.second.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
//@Table(schema = "public")
@Table(name = "user", schema = "public")

public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private UUID id;
    private String username;
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

