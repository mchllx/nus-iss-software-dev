package com.example.day35.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.day35.model.Game;
import com.example.day35.repository.GamesRepository;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;

@Controller
@CrossOrigin(origins={"http://localhost:4200"})
@RequestMapping(path="/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class GameController {

    @Autowired
    private GamesRepository gamesRepo;

    //GET /api/game/search?name=abc
    @GetMapping(path="/game/search")
    @ResponseBody public ResponseEntity<String> getGameSearch(@RequestParam String name) {
        List<Game> results = gamesRepo.findGameByName(name);
        JsonArrayBuilder arrBuilder = Json.createArrayBuilder();

        // gamesRepo.findGameByName(name).stream()
        //     .map(g -> g.toJson())
        //     .forEach(arrBuilder::add);

            return ResponseEntity.ok(arrBuilder.build().toString()); 
    }
    
}
