package com.example.uolhost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uolhost.model.Player;
import com.example.uolhost.model.dto.PlayerDTO;
import com.example.uolhost.repositories.PlayerRepository;

import jakarta.validation.Valid;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlaye(@Valid PlayerDTO dto) {
        Player newPlayer = new Player(dto);
        return playerRepository.save(newPlayer);
    }
    
}
