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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String username;
    private String email;
    private String password;
    private Date birthDate;
    private int age;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    public User(String username, String email, String password, Date birthDate, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.age = age;
    }
}
