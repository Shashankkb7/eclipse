package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import com.xworkz.collection.DTO.DataBaseVendorDTO;
import com.xworkz.collection.constant.Type;

public class DataBaseVendorRunner {

	public static void main(String[] args) {

		Collection<DataBaseVendorDTO> vendorDTOs = new ArrayList<DataBaseVendorDTO>();
		vendorDTOs.add(new DataBaseVendorDTO("MySQL", "Arun", Type.SQL, 1000.20, 100));
		vendorDTOs.add(new DataBaseVendorDTO("Redis", "Uday", Type.JAVA, 800.40, 50));
		vendorDTOs.add(new DataBaseVendorDTO("MongoDB", "Srisham", Type.WEB, 900.60, 150));
		vendorDTOs.add(new DataBaseVendorDTO("Mimer SQL", "Nayana", Type.SQL, 1500.80, 60));
		vendorDTOs.add(new DataBaseVendorDTO("NewSQL", "Anusha", Type.SQL, 1050.20, 200));

		System.out.println("Converting database developedby to uppercase");
		vendorDTOs.stream().map(dto -> dto.getDevelopedBy().toUpperCase()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));

		System.out.println(System.lineSeparator());
		System.out.println("Databse license cost less than 100 and type is sql");
		vendorDTOs.stream().filter(dto -> dto.getLicenseCost() <= 100 && dto.getType().equals(Type.SQL))
				.collect(Collectors.toList()).forEach(dto -> System.out.println(dto));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all database vendor types");
		vendorDTOs.stream().map(dto -> dto.getType()).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto));
	}

}
