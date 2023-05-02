package com.xworkz.commonModules.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "technology_table")
@NamedQuery(name="findByView",query = "select entity from TechnologyEntity entity where entity.id=:byId")
public class TechnologyEntity {
	@Id
	@Column(name = "t_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long t_id;

	@Column(name = "a_id")
	private int id;

	@Column(name = "t_name")
	private String name;
	
	@Column(name = "t_language")
	private String language;
	
	@Column(name = "t_version")
	private Double version;
	
	@Column(name = "t_owner")
	private String owner;
	
	@Column(name = "t_support_from")
	private String supportFrom;
	
	@Column(name = "t_support_to")
	private String supportTo;
	
	@Column(name = "t_license")
	private Long license;
	
	@Column(name = "t_open_source")
	private boolean openSource;
	
	@Column(name = "OS_type")
	private String type;

	/*
	 * @Column(name = "t_createdBy") private String createdBy;
	 * 
	 * @Column(name = "t_createdDate") private LocalDateTime createdDate;
	 * 
	 * @Column(name = "t_updatedBy") private String updatedBy;
	 * 
	 * @Column(name = "t_updatedDate") private LocalDateTime updatedDate;
	 */
}
