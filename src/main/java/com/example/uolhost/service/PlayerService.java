package com.example.uolhost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uolhost.infra.CodinameHandler;
import com.example.uolhost.model.GroupType;
import com.example.uolhost.model.Player;
import com.example.uolhost.model.dto.PlayerDTO;
import com.example.uolhost.repositories.PlayerRepository;

import jakarta.validation.Valid;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private CodinameHandler codinameHandler;

    public Player createPlaye(@Valid PlayerDTO dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return playerRepository.save(newPlayer);
    }
    
    private String getCodiname(GroupType groupType) {
        return codinameHandler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
       return playerRepository.findAll();
    }

}
