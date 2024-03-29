package com.xworkz.oven.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.oven.dto.MicrowaveDTO;
import com.xworkz.oven.entity.MicrowaveEntity;
import com.xworkz.oven.repository.MicrowaveRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MicrowaveServiceImpl implements MicrowaveService {

	@Autowired
	private MicrowaveRepository microwaveRepository;

	public MicrowaveServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<MicrowaveDTO>> validateAndSave(MicrowaveDTO dto) {
		Set<ConstraintViolation<MicrowaveDTO>> violations = violations(dto);
		if (violations != null && !violations.isEmpty()) {
			log.info("Violations in dto " + dto);
			return violations;
		} else {
			log.info("Violations is not there in dto,can save");
			MicrowaveEntity entity = new MicrowaveEntity();
			BeanUtils.copyProperties(dto, entity);
			/*entity.setName(dto.getName());
			entity.setPrice(dto.getPrice());
			entity.setCapacity(dto.getCapacity());
			entity.setColor(dto.getColor());
			entity.setSince(dto.getSince());
			entity.setId(dto.getId());*/
			boolean saved = this.microwaveRepository.save(entity);
			log.info("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	private Set<ConstraintViolation<MicrowaveDTO>> violations(MicrowaveDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MicrowaveDTO>> violations = validator.validate(dto);
		return violations;
	}

	@Override
	public MicrowaveDTO findById(int id) {
		if (id > 0) {
			MicrowaveEntity entity = this.microwaveRepository.findById(id);
			if (entity != null) {
				log.info("Entity is found in service for id " + id);
				MicrowaveDTO dto = new MicrowaveDTO();
				BeanUtils.copyProperties(entity,dto);
				/*dto.setName(entity.getName());
				dto.setPrice(entity.getPrice());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setSince(entity.getSince());
				dto.setId(entity.getId());*/
				return dto;
			}
		}
		return MicrowaveService.super.findById(id);
	}

	@Override
	public List<MicrowaveDTO> findByName(String name) {
		log.info("Running findByName in service " + name);
		if (name != null && !name.isEmpty()) {
			log.info("Name is valid calling repo");
			List<MicrowaveEntity> entities = this.microwaveRepository.findByName(name);
			List<MicrowaveDTO> listOfDTO = new ArrayList<MicrowaveDTO>();
			for (MicrowaveEntity entity : entities) {
				MicrowaveDTO dto = new MicrowaveDTO();
				BeanUtils.copyProperties(entity,dto);
				/*dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setSince(entity.getSince());*/
				listOfDTO.add(dto);
			}
			log.info("Size in dtos " + listOfDTO.size());
			log.info("size in entities " + entities.size());
			return listOfDTO;
		} else {
			System.err.println("Name is invalid");
		}
		return MicrowaveService.super.findByName(name);
	}

	@Override
	public List<MicrowaveDTO> findByColor(String color) {
		log.info("Running findByColor in service " + color);
		if (color != null && !color.isEmpty()) {
			log.info("Color is valid calling repo");
			List<MicrowaveEntity> entities = this.microwaveRepository.findByColor(color);
			List<MicrowaveDTO> listOfDTO = new ArrayList<MicrowaveDTO>();
			for (MicrowaveEntity entity : entities) {
				MicrowaveDTO dto = new MicrowaveDTO();
				BeanUtils.copyProperties(entity,dto);
				/*dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setSince(entity.getSince());*/
				listOfDTO.add(dto);
			}
			log.info("Size in dtos " + listOfDTO.size());
			log.info("size in entities " + entities.size());
			return listOfDTO;
		} else {
			log.info("Color is invalid");
		}
		return MicrowaveService.super.findByColor(color);
	}
	
	@Override
	public List<MicrowaveDTO> findByNameAndColor(String name, String color) {
		log.info("Running findByNameAndColor in service " + name + color);
		if (name != null && !name.isEmpty()) {
			log.info("Name and Color is valid calling repo");
			List<MicrowaveEntity> entities = this.microwaveRepository.findByNameAndColor(name, color);
			List<MicrowaveDTO> listOfDTO = new ArrayList<MicrowaveDTO>();
			for (MicrowaveEntity entity : entities) {
				MicrowaveDTO dto = new MicrowaveDTO();
				BeanUtils.copyProperties(entity,dto);
				/*dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setSince(entity.getSince());*/
				listOfDTO.add(dto);
			}
			log.info("Size in dtos " + listOfDTO.size());
			log.info("size in entities " + entities.size());
			return listOfDTO;
		} else {
			log.info("Name and Color is invalid");
		}
		return MicrowaveService.super.findByNameAndColor(name, color);
	}
	
	@Override
	public Set<ConstraintViolation<MicrowaveDTO>> validateAndUpdate(MicrowaveDTO dto) {
		Set<ConstraintViolation<MicrowaveDTO>> violations = violations(dto);
		if (violations != null && !violations.isEmpty()) {
			log.info("Violations in dto " + dto);
			return violations;
		} else {
			log.info("Violations is not there in dto,can save");
			MicrowaveEntity entity = new MicrowaveEntity();
			BeanUtils.copyProperties(dto,entity);
			/*entity.setName(dto.getName());
			entity.setPrice(dto.getPrice());
			entity.setCapacity(dto.getCapacity());
			entity.setColor(dto.getColor());
			entity.setSince(dto.getSince());
			entity.setId(dto.getId());*/
			boolean saved = this.microwaveRepository.update(entity);
			log.info("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public MicrowaveDTO deleteById(int id) {
		if (id > 0) {
			MicrowaveEntity entity = this.microwaveRepository.deleteById(id);
			if (entity != null) {
				log.info("Entity is found in service for id " + id);
				MicrowaveDTO dto = new MicrowaveDTO();
				BeanUtils.copyProperties(entity,dto);
				/*dto.setName(entity.getName());
				dto.setPrice(entity.getPrice());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setSince(entity.getSince());
				dto.setId(entity.getId());*/
				return dto;
			}
		}
		return MicrowaveService.super.deleteById(id);
	}
	
	@Override
	public List<MicrowaveDTO> findAll() {
		log.info("Running findAll in service ");
			log.info("Entity is valid calling repo");
			List<MicrowaveEntity> entities = this.microwaveRepository.findAll();
			List<MicrowaveDTO> listOfDTO = new ArrayList<MicrowaveDTO>();
			for (MicrowaveEntity entity : entities) {
				MicrowaveDTO dto = new MicrowaveDTO();
				BeanUtils.copyProperties(entity,dto);
				/*dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCapacity(entity.getCapacity());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setSince(entity.getSince());*/
				listOfDTO.add(dto);
			}
			log.info("Size in dtos " + listOfDTO.size());
			log.info("size in entities " + entities.size());
			return listOfDTO;
	}
}