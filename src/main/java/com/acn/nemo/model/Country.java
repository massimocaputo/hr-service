package com.acn.nemo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the countries database table.
 */
@Entity
@Table(name="countries")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@EqualsAndHashCode.Exclude
	@JoinColumn(name="region_id", nullable=false)
	@JsonBackReference
	private Region region;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="country", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Location> locations;


}