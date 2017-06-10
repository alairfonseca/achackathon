package com.hackathon.scalitimes.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "User", schema = "scalitimesbb")
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String login;

    private String email;

    private String password;


}
