package com.xworkz.crud.service;

import com.xworkz.crud.constant.Color;
import com.xworkz.crud.constant.HelmetType;
import com.xworkz.crud.dto.HelmetDTO;
import com.xworkz.crud.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepository;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		System.out.println("Running validate and save " + dto);
		String brand = dto.getBrand();
		HelmetType type = dto.getType();
		Double price = dto.getPrice();
		Color color = dto.getColor();
		boolean validBrand = false;
		boolean validType = false;
		boolean validPrice = false;
		boolean validColor = false;

		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("Valid Helmet brand " + brand);
			validBrand = true;
		} else {
			System.err.println("Invalid Helmet brand " + brand);
		}

		if (type != null) {
			System.out.println("Valid Helmet type " + type);
			validType = true;
		} else {
			System.err.println("Invalid Helmet type " + type);
		}

		if (price != null && price >= 500 && price <= 10000) {
			System.out.println("Valid Helmet price " + price);
			validPrice = true;
		} else {
			System.err.println("Invalid Helmet price " + price);

		}

		if (color != null) {
			System.out.println("Valid Helmet color " + color);
			validColor = true;
		} else {
			System.err.println("Invalid Helmet color " + color);
		}

		if (validBrand && validType && validPrice && validColor) {
			System.out.println("Helmet is valid,can save using repository");
			boolean saved = this.helmetRepository.save(dto);
			System.out.println("Helmet DTO is saved " + saved);
			return saved;
		}
		return false;
	}

}
