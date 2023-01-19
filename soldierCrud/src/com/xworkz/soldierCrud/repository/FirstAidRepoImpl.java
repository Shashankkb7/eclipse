package com.xworkz.soldierCrud.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldierCrud.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aidDTO) {
		System.out.println("Registering save in FirstAidRepoImpl");
		System.out.println("aidDTO " + aidDTO);
		return true;
	}

}
