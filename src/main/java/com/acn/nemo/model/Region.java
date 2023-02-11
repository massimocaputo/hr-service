package com.acn.nemo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


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
	private Long regionId;

	@Column(name="region_name", length=25)
	private String regionName;

	//bi-directional many-to-one association to Country
	@OneToMany(mappedBy="region", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Country> countries;


}