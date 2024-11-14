package com.dev.dslist.controllers;

import com.dev.dslist.DTO.GameDTO;
import com.dev.dslist.DTO.GameMinDTO;
import com.dev.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO finbyId(@PathVariable("id") Long id) {
        GameDTO dto = gameService.findById(id);
        return dto;
    }


    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO>  dto = gameService.findAll();
        return dto;
    }
}
