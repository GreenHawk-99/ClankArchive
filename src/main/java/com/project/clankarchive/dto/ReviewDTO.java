package com.project.clankarchive.dto;

import com.project.clankarchive.model.Game;
import com.project.clankarchive.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {
    private Long idReview;
    private boolean like;
    private String reviews;

    private User user;
    private Game game;
}
