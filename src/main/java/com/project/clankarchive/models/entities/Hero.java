package com.project.clankarchive.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value = "Formateur")
public class Hero extends Article {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHero;
    */
    private String heroName;
    private String heroImage;
    private String heroSummary;
    @ManyToMany
    private List<Game> games;
}
