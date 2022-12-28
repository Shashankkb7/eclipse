package com.xworkz.collection.DTO;

import java.io.Serializable;

public class GameDTO implements Serializable {

	private String name;
	private String type;
	private Integer noOfPlayers;

	public GameDTO() {

	}

	public GameDTO(String name, String type, Integer noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public boolean equals(Object reference) {
		System.out.println("Running equals method");
		if (reference != null) {
			if (reference instanceof GameDTO) {
				GameDTO dto = (GameDTO) reference;
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching " + name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

}
