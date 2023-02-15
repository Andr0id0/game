package com.KMN.Game.Repositorys;


import com.KMN.Game.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByNik(String nik);
}
