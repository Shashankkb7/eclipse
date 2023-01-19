package com.xworkz.soldierCrud.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldierCrud.dto.MissileDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Registering save in MissileRepoImpl");
		System.out.println("dto " + dto);
		return true;
	}

}
