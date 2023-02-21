package com.xworkz.bigBasket.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BigBasketDTO {
	@NotBlank(message = "Name cannot be null")
	@Size(min = 3, max = 20, message = "Name should be more than 3 or less than 20 characters")
	private String name;
	@NotBlank(message = "OwnerName cannot be null")
	@Size(min = 3, max = 20, message = "OwnerName should be more than 3 or less than 20 characters")
	private String ownerName;
	@NotBlank(message = "Item should be selected")
	private String item;
	@NotBlank(message = "Area should be selected")
	private String area;
	@NotNull(message = "PhNo cannot be null or blank")
	@Min(value = 1, message = "PhNo cannot be less than zero")
	private Long phNo;
	@Email(message = "Email is invalid")
	@NotBlank(message = "Email cannot be blank")
	private String email;
	@NotBlank(message = "Password cannot be blank")
	@Size(min = 3, max = 20, message = "Password should be 8 characters first letter should be caps,fourth letter should be special charcs,last chars should be number")
	private String password;
	@NotNull(message = "NoOfWorkers cannot be null or blank")
	@Min(value = 1, message = "NoOfWorkers cannot be less than zero")
	private Integer noOfWorkers;
	@NotNull(message = "Discount cannot be null or blank")
	@Min(value = 1, message = "Discount cannot be less than zero")
	private Double discount;
	@NotNull(message = "GstNo cannot be null or blank")
	@Min(value = 1, message = "GstNo cannot be less than zero")
	private Long gstNo;
}
