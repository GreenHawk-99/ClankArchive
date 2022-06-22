package com.project.clankarchive.dto;

import lombok.Getter;
import lombok.Setter;

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
}
