package com.example.uolhost.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.uolhost.model.GroupType;
import com.example.uolhost.service.CodinameService;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService codinameService;

    public String findCodiname(GroupType groupType) {
        if(groupType == GroupType.AVANGERS) {
            String firstMatch = codinameService.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.codinameService.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = codinameService.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.codinameService.getAvangersCodinameList().remove(firstMatch);
        return firstMatch;
    }

    
}
