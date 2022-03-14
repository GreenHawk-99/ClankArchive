package com.project.clankarchive.dto;

import com.project.clankarchive.model.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
public class DeveloperDTO {
    private Long idDeveloper;
    private String developerName;
    private String developerImage;

    private List<Game> games;
}
