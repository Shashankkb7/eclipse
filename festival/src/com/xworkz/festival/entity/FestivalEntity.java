package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "festival_table")
@NamedQuery(name = "findByIdAndName",query = "select entity from FestivalEntity entity where entity.name=:nam and entity.id=:id ")
@NamedQuery(name = "findByNameAndRegionAndMainGod",query = "select entity from FestivalEntity entity where entity.name=:nam and entity.region=:reg and entity.mainGod=:main")
@NamedQuery(name = "findByMainGod",query = "select entity from FestivalEntity entity where entity.mainGod=:main")
@NamedQuery(name = "findTotalDaysByName",query = "select entity.totalDays from FestivalEntity entity where entity.name=:nam")
@NamedQuery(name = "findRegionAndMainGodByNameAndId",query = "select entity.region,entity.mainGod from FestivalEntity entity where entity.name=:nam and entity.id=:id")
@NamedQuery(name = "findMainGodAndTotalDaysByName",query = "select entity.mainGod,entity.totalDays from FestivalEntity entity where entity.name=:nam")
@NamedQuery(name = "findTotal",query = "select sum (entity) from FestivalEntity entity")
@NamedQuery(name = "findMaxTotalDays",query = "select max(entity.totalDays) from FestivalEntity entity")
public class FestivalEntity {

	@Id
	@Column(name = "f_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_region")
	private String region;
	@Column(name = "f_total_days")
	private int totalDays;
	@Column(name = "f_sweet")
	private String sweet;
	@Column(name = "f_main_god")
	private String mainGod;

	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}
}
