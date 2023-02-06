package com.xworkz.shashank.dto;

import lombok.Data;

@Data
public class BeverageDTO {

	private String name;
	private Double quantity;
	private boolean quality;
	private String color;
	private Double price;
	private boolean stock;
	private Double discount;
	private boolean cold;
}
