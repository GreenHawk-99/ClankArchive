package com.project.clankarchive.model;

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

    @OneToMany
    private List<Review> reviews;
    @ManyToMany
    private List<Hero> heroes;
    @ManyToMany
    private List<Developer> developers;
    @OneToMany
    private List<Editor> editors;

    public Game(String gameName, String gameImage, String gameSummary, Date releaseDate, int ageRestriction) {
        this.gameName = gameName;
        this.gameImage = gameImage;
        this.gameSummary = gameSummary;
        this.releaseDate = releaseDate;
        this.ageRestriction = ageRestriction;
    }
}
