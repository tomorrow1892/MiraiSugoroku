package ksp.group3.miraiSugoroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ksp.group3.miraiSugoroku.entity.Player;

@RestController
public class GameRestController {
    ObjectMapper objectMapper = new ObjectMapper();
    @GetMapping("/api/diceRoll")
    String diceRoll(@RequestParam String suzi) throws JsonProcessingException{
    
        System.out.println(suzi);
        return objectMapper.writeValueAsString(new Player(1, "さんだ", 100, 1+Integer.parseInt(suzi) , false))  ;
    }

    @GetMapping("/api/doEvent")
    String doEvent() throws JsonProcessingException{
        return objectMapper.writeValueAsString( new Player(1, "さんだ", 200, 1, false));
    }
    
}