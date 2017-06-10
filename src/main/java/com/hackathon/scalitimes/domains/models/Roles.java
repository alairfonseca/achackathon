package com.hackathon.scalitimes.domains.models;

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
@Table(name = "Roles", schema = "scalitimesbb")
public class Roles {

	@Id
    @GeneratedValue
    private Long id;
}
