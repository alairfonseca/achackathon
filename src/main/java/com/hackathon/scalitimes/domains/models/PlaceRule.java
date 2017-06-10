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
@Table(name = "place_rule")
public class PlaceRule {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long value;

    @Column()
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Role> roles;
}
