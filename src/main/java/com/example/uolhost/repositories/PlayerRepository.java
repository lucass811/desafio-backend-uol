package com.example.uolhost.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uolhost.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    
}
