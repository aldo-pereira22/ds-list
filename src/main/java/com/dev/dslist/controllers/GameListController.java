package com.dev.dslist.controllers;

import com.dev.dslist.DTO.GameDTO;
import com.dev.dslist.DTO.GameListDTO;
import com.dev.dslist.DTO.GameMinDTO;
import com.dev.dslist.service.GameListService;
import com.dev.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO>  dto = gameListService.findAll();
        return dto;
    }
}
