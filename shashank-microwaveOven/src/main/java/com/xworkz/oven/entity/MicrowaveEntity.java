package com.xworkz.oven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "microwave_table")
@NamedQuery(name = "findByName", query = "select ent from MicrowaveEntity ent where ent.name=:nam")
@NamedQuery(name = "findByColor", query = "select ent from MicrowaveEntity ent where ent.color=:col")
@NamedQuery(name="findByNameAndColor",query = "select entity from MicrowaveEntity entity where entity.name=:nam and entity.color=:col")
@NamedQuery(name = "findAll",query = "select entity from MicrowaveEntity entity")
public class MicrowaveEntity {
	@Id
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_price")
	private Double price;
	@Column(name = "m_capacity")
	private Double capacity;
	@Column(name = "m_color")
	private String color;
	@Column(name = "m_since")
	private Integer since;
}
