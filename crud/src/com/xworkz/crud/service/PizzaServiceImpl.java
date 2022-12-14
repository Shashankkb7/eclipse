package com.xworkz.crud.service;

import com.xworkz.crud.constant.PizzaSize;
import com.xworkz.crud.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validDateAndSave(PizzaDTO dto) {
		System.out.println("Running validDateAndSave " + dto);
		String name = dto.getName();
		String company = dto.getCompany();
		String flavour = dto.getFlavour();
		String type = dto.getType();
		PizzaSize size = dto.getSize();
		double price = dto.getPrice();
		boolean validName,validCompany,validFlavour,validType,validSize,validPrice= false;
		/*boolean validCompany = false;
		boolean validFlavour = false;
		boolean validType = false;
		boolean validSize = false;*/
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid pizza name " + name);
			validName = true;
		} else {
			System.err.println("Not valid pizza name " + name);
		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Valid pizza company " + company);
			validCompany = true;
		} else {
			System.err.println("Not valid pizza company " + company);
		}

		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("Valid pizza flavour " + flavour);
			validFlavour = true;
		} else {
			System.err.println("Not Valid pizza flavour " + flavour);
		}

		if (type != null && type == "Veg" || type == "nonVeg") {
			System.out.println("Valid pizza type " + type);
			validType = true;
		} else {
			System.err.println("Not valid pizza type " + type);
		}

		if (size != null) {
			System.out.println("Valid pizza size " + size);
			validSize = true;
		} else {
			System.err.println("Not valid pizza size " + size);
		}

		if(price>=50d && price<=12000d) {
			System.out.println("Valid price "+ price);
			validPrice=true;
		}else {
			System.err.println("Not valid pizza price " + price);
		}
		return false;
	}

}
