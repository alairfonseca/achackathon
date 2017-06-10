package com.hackathon.scalitimes.domains.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    //@Transient
    //private List<Solicitations> solicitations;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "worked_hours")
    private List<WorkedHours> workedHours;


}
