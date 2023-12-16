package com.example.uolhost.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uolhost.model.Player;
import com.example.uolhost.model.dto.PlayerDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/players")
public class PlayerController {
    
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO dto) {
        return null;
    }
}
