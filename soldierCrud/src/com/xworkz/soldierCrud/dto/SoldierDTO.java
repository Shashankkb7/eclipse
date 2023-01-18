package com.xworkz.soldierCrud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@Size(min = 5, max = 10, message = "Name is should be more than 5 or less than 10")
	private String name;
	@Min(value = 3, message = "Id should be more than 3")
	@Max(value = 1000, message = "Id should be less than 15")
	private int id;
	@NotNull
	@Size(min = 2, max = 13, message = "Country is should be more than 2 or less than 13")
	private String country;
	@NotNull
	@Size(min = 3, max = 20, message = "Batallian is should be more than 3 or less than 20")
	private String batallian;
	@NotNull
	@Size(min = 4, max = 15, message = "Rank is should be more than 4 or less than 15")
	private String rank;
}
