package com.project.clankarchive.dto;

import com.project.clankarchive.models.entities.Game;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DeveloperDTO {
    private Long idDeveloper;
    private String developerName;
    private String developerImage;

    private List<Game> games;
}
