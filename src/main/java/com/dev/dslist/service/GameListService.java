package com.dev.dslist.service;

import com.dev.dslist.DTO.GameDTO;
import com.dev.dslist.DTO.GameListDTO;
import com.dev.dslist.DTO.GameMinDTO;
import com.dev.dslist.entities.Game;
import com.dev.dslist.entities.GameList;
import com.dev.dslist.repositories.GameListRepository;
import com.dev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {


    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x-> new GameListDTO(x)).toList();
    }


}
