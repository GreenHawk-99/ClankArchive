package com.project.clankarchive.dto;

import com.project.clankarchive.models.entities.Game;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HeroDTO {
    private Long idHero;
    private String heroName;
    private String heroImage;
    private String heroSummary;

    private List<Game> games;
}
