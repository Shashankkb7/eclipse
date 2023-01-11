package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("hardwareShopId")
	private int id;
	@Autowired
	@Qualifier("hardwareShopName")
	private String name;
	@Autowired
	@Qualifier("hardwareShopGstNo")
	private long gstNo;
	@Autowired
	@Qualifier("hardwareShopOwnerName")
	private String ownerName;
	@Autowired
	@Qualifier("hardwareShopAddress")
	private String address;

	public HardwareShop() {
		System.out.println("Creating HardwareShop using default const by Spring");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}