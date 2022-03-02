package com.project.clankarchive.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDeveloper;
    private String developerName;
    private String developerImage;

    @ManyToMany
    private List<Game> games;

    public Developer(String developerName, String developerImage, List<Game> games) {
        this.developerName = developerName;
        this.developerImage = developerImage;
    }
}
