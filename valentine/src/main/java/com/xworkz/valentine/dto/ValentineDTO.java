package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {

	private int id;
	@NotBlank(message = "Name cannot be null")
	@Size(min = 3, max = 20, message = "Name should be more than 3 or less than 20 characters")
	private String name;
	@NotBlank(message = "ValentineName cannot be null")
	@Size(min = 3, max = 20, message = "ValentineName should be more than 3 or less than 20 characters")
	private String valentineName;
	@NotBlank(message = "Place should be selected")
	private String place;
	@NotBlank(message = "Gift should be selected")
	private String gift;
}
