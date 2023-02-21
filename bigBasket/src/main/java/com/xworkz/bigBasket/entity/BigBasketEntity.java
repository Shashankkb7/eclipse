package com.xworkz.bigBasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "bigbasket_table")
public class BigBasketEntity {
	@Id
	@Column(name = "b_id")
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_ownerName")
	private String ownerName;
	@Column(name = "b_item")
	private String item;
	@Column(name = "b_area")
	private String area;
	@Column(name = "b_phNo")
	private Long phNo;
	@Column(name = "b_email")
	private String email;
	@Column(name = "b_password")
	private String password;
	@Column(name = "b_noofworkers")
	private Integer noOfWorkers;
	@Column(name = "b_discount")
	private Double discount;
	@Column(name = "b_gstNo")
	private Long gstNo;
}
