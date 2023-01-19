package com.xworkz.soldierCrud.service;

import com.xworkz.soldierCrud.dto.FirstAidDTO;

public interface FirstAidService {

	boolean validateAndSave(FirstAidDTO aidDTO);
}
