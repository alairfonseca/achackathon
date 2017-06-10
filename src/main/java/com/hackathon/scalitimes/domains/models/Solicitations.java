package com.hackathon.scalitimes.domains.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Pedro on 10/06/2017.
 */
@Entity(name = "SOLICITATIONS")
public class Solicitations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SOLICITATIONS_ID")
    private Long id;
}
