package com.hackathon.scalitimes.domains.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Pedro on 10/06/2017.
 */
@Entity(name = "solicitations")
public class Solicitations {

    @Id
    @GeneratedValue
    private Long id;
}
