package com.project.clankarchive.dto;

import com.project.clankarchive.model.Review;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Long idUser;
    private String username;
    private String email;
    private String password;
    private Date birthDate;
    private int age;

    private List<Review> reviews;
}
