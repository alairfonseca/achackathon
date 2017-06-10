package com.hackathon.scalitimes.domains.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "worked_hours")
public class WorkedHours {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "user")
    private User user;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime time;
}
