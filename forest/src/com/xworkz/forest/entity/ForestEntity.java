package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "forest_table")
@NamedQuery(name = "findByName",query = "select entity from ForestEntity entity where entity.name='Bandipuur'")
@NamedQuery(name = "findByState",query = "select entity from ForestEntity entity where entity.state='Odissa'")
@NamedQuery(name = "findByNameAndStateAndArea",query = "select entity from ForestEntity entity where entity.name='Nilagiri' and entity.state='Maharastra' and entity.area=12458 ")
@NamedQuery(name = "findAreaByName",query = "select entity.area from ForestEntity entity where entity.name='Nagarahole'")
@NamedQuery(name = "findIdByNameAndState",query = "select entity.id from ForestEntity entity where entity.name='Abujimarh' and entity.state='Gujurata'")
@NamedQuery(name = "findNameById",query = "select entity.name from ForestEntity entity where entity.id=1 ")
@NamedQuery(name = "findStateByNameAndArea",query = "select entity.state from ForestEntity entity where entity.name='Nilagiri' and entity.area=12458 ")
@NamedQuery(name = "findCount",query = "select count(entity) from ForestEntity entity")
@NamedQuery(name = "findMaxArea",query = "select max(entity.area) from ForestEntity entity")
public class ForestEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "state")
	private String state;
	@Column(name = "area")
	private Double area;
}
