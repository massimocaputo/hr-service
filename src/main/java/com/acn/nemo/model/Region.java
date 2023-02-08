package com.acn.nemo.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the regions database table.
 * 
 */
@Entity
@Table(name="regions")
@Data
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="region_id", unique=true, nullable=false)
	private Integer regionId;

	@Column(name="region_name", length=25)
	private String regionName;

	//bi-directional many-to-one association to Country
	@OneToMany(mappedBy="region")
	private List<Country> countries;


}