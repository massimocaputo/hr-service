package com.acn.nemo.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the countries database table.
 * 
 */
@Entity
@Table(name="countries")
@Data
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="country_id", unique=true, nullable=false, length=2)
	private String countryId;

	@Column(name="country_name", length=40)
	private String countryName;

	//bi-directional many-to-one association to Region
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="region_id", nullable=false)
	@JsonIgnore
	private Region region;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="country")
	private List<Location> locations;


}