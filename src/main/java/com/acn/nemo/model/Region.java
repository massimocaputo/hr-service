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
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the regions database table.
 * 
 */
@Entity
@Table(name="regions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region implements Serializable {
	

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7297550691058136283L;

	/** The region id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="region_id", unique=true, nullable=false)
	private Long regionId;

	/** The region name. */
	@Column(name="region_name", length=25)
	private String regionName;

	/** The countries. */
	//bi-directional many-to-one association to Country
	@OneToMany(mappedBy="region", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Country> countries;


}