package com.xworkz.crud.repository;

public class IplRepositoryImple  implements IplRepository{

	private IplDTO[] iplDto = new IplDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running create of IplDTO" + dto);
		if (this.currentIndex >= this.iplDto.length) {
			System.out.println("Size exceeded cannot add more iplteam");
			return false;
		}

		this.iplDto[this.currentIndex] = dto;
		System.out.println("Saved" + dto + "in index" + this.currentIndex);
		this.currentIndex++;
		return true;
	}

}
