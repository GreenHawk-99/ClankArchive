package com.project.clankarchive.dto;

import com.project.clankarchive.models.entities.Developer;
import com.project.clankarchive.models.entities.Editor;
import com.project.clankarchive.models.entities.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class GameDTO {
    private Long idGame;
    private String gameName;
    private String gameImage;
    private String gameSummary;
    private Date releaseDate;
    private int ageRestriction;

    private List<Review> reviews;
    private List<Hero> heroes;
    private List<Developer> developers;
    private List<Editor> editors;
}
