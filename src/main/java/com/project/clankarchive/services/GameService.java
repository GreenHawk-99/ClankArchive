package com.project.clankarchive.services;

import com.project.clankarchive.dto.GameDTO;
import com.project.clankarchive.models.entities.Game;
import com.project.clankarchive.models.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    GameRepository gameRepository;
    GenreRepository genreRepository;
    PlatformRepository platformRepository;
    DeveloperRepository developerRepository;
    EditorRepository editorRepository;

    @Autowired
    public GameService(GameRepository gameRepository,
                       GenreRepository genreRepository,
                       PlatformRepository platformRepository,
                       DeveloperRepository developerRepository,
                       EditorRepository editorRepository) {
        this.gameRepository = gameRepository;
        this.genreRepository = genreRepository;
        this.platformRepository = platformRepository;
        this.developerRepository = developerRepository;
        this.editorRepository = editorRepository;
    }

    public List<Game> findAllGames(){
        return gameRepository.findAll();
    }

    public Game findOneGame(Long id){
        return gameRepository.findById(id).orElse(null);
    }

    public void saveGame(GameDTO gameDTO){
        Game game;
        if (null==gameDTO.getIdGame()){
            game = new Game();
        } else {
            game = gameRepository.findById(gameDTO.getIdGame()).orElse(new Game());
        }
        game.setGameName(gameDTO.getGameName());
        game.setGameImage(gameDTO.getGameImage());
        game.setReleaseDate(gameDTO.getReleaseDate());
        game.setAgeRestriction(gameDTO.getAgeRestriction());
        game.setGameSummary(gameDTO.getGameSummary());
        gameRepository.save(game);
    }

    public void deleteGame(Long id){
        gameRepository.deleteById(id);
    }


}
