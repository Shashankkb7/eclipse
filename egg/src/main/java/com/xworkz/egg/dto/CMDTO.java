package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CMDTO {
	@NotNull(message = "CM name cannot be null or blank")
	@Size(min = 3, max = 20, message = "name should be more than 3 or less than 20 chacts")
	public String name;
	@NotBlank(message = "Party cannot be null or blank")
	public String party;
	@NotBlank(message = "State cannot be null or blank")
	public String state;
	@NotNull(message = "Tenure cannot be null or blank")
	@Min(value = 1,message = "Tenure cannot be less than zero")
	public Integer tenure;
	@NotBlank(message = "Portfolio cannot be null or blank")
	@Size(min = 1,message = "portfolio should be more than 1")
	public String portfolio;
}
