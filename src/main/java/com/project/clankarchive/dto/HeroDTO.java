package com.project.clankarchive.dto;

import com.project.clankarchive.model.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
