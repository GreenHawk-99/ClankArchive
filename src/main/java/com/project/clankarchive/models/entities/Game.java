package com.project.clankarchive.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGame;
    private String gameName;
    private String gameImage;
    private Date releaseDate;
    private int ageRestriction;
    private String gameSummary;

    @ManyToMany(mappedBy = "games")
    private List<Developer> developers;
    @OneToMany(mappedBy = "game")
    private List<Editor> editors;
}
