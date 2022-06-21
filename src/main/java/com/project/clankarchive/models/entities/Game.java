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
    private String gameSummary;
    private Date releaseDate;
    private int ageRestriction;

    @OneToMany(mappedBy = "game")
    private List<Review> reviews;
    @ManyToMany(mappedBy = "games")
    private List<Hero> heroes;
    @ManyToMany(mappedBy = "games")
    private List<Developer> developers;
    @OneToMany(mappedBy = "game")
    private List<Editor> editors;

    public Game(String gameName, String gameImage, String gameSummary, Date releaseDate, int ageRestriction) {
        this.gameName = gameName;
        this.gameImage = gameImage;
        this.gameSummary = gameSummary;
        this.releaseDate = releaseDate;
        this.ageRestriction = ageRestriction;
    }
}
