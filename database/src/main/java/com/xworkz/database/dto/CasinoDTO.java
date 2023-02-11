package com.xworkz.database.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "casino_table")
public class CasinoDTO {
	@Column(name = "c_id")
	@Id
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_cruiseName")
	private String cruiseName;
	@Column(name = "c_entryFee")
	private Double entryFee;
	@Column(name = "c_freeFood")
	private boolean freeFood;
}
