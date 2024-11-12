package com.dev.dslist.service;

import com.dev.dslist.DTO.GameMinDTO;
import com.dev.dslist.entities.Game;
import com.dev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO>  dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
