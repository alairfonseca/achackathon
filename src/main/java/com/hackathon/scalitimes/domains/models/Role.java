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
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "profile_rule")
    private List<ProfileRule> rules;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "place_rule")
    private List<PlaceRule> placeRules;

}
