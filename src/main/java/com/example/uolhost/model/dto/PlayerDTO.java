package com.example.uolhost.model.dto;

import com.example.uolhost.model.GroupType;

public record PlayerDTO(
    String name,
    String email,
    String phoneNumber,

    GroupType groupType
){
    
  
}
