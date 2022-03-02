package com.project.clankarchive.model;

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
    private User users;
    @ManyToOne
    private Game games;

    public Review(boolean like, String reviews) {
        this.like = like;
        this.reviews = reviews;
    }
}
