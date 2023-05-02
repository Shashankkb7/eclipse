package com.xworkz.commonModules.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TechnologyDTO {

	private Long t_id;

	private int id;

	@NotBlank(message = "Name can't be null")
	private String name;

	@NotBlank(message = "language can't be null")
	private String language;

	@NotNull(message = "version can't be null")
	private Double version;

	@NotBlank(message = "owner can't be null")
	private String owner;

	@NotBlank(message = "supportFrom can't be null")
	private String supportFrom;

	@NotBlank(message = "supportTo can't be null")
	private String supportTo;

	@NotNull(message = "license can't be null")
	private Long license;

	private boolean openSource;

	@NotBlank(message = "type can't be null")
	private String type;
	
}
