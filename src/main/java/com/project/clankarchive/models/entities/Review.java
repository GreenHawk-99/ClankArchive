package com.project.clankarchive.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReview;
    private boolean like;
    private String reviews;

    @ManyToOne
    private User user;
    @ManyToOne
    private Game game;

    public Review(boolean like, String reviews) {
        this.like = like;
        this.reviews = reviews;
    }
}
