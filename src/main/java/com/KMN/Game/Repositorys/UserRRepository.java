package com.KMN.Game.Repositorys;

import com.KMN.Game.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
