package com.project.clankarchive.dto;

import com.project.clankarchive.model.Developer;
import com.project.clankarchive.model.Editor;
import com.project.clankarchive.model.Review;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
