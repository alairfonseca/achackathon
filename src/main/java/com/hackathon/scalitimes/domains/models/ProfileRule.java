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
@Table(name = "profile_rule")
public class ProfileRule {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long value;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role")
    private List<Role> roles;

}
