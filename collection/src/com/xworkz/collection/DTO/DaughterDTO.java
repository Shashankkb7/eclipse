package com.xworkz.collection.DTO;

public class DaughterDTO extends CompanyCEODTO{

	private String name;
	private long number;
	private int age;
	private boolean committed;
	private boolean alive;

	public DaughterDTO() {

	}

	public DaughterDTO(String name, long number, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}
	
	@Override
	public int hashCode() {

		return 100;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", number=" + number + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals");
		{
			if (obj != null) {
				if (obj instanceof DaughterDTO) {
					DaughterDTO dto = (DaughterDTO) obj;
					{
						if (dto.name.equals(this.name)) {
							System.out.println("name " + dto);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
