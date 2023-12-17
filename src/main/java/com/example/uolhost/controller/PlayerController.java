package com.example.uolhost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uolhost.model.Player;
import com.example.uolhost.model.dto.PlayerDTO;
import com.example.uolhost.service.PlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;
    
    
    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO dto) {
        Player newPlayer = playerService.createPlaye(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
}
