package com.KMN.Game.Models;


import com.KMN.Game.Enams.Role;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nik, password, email;

    private boolean active;


    private String role;



    public Player() {
    }

    public Player(String nik, String password, String email, String role, boolean active) {
        this.nik = nik;
        this.password = password;
        this.email = email;
        this.role = role;
        this.active = active;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
