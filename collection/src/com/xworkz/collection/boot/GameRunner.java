package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.GameDTO;

public class GameRunner {

	public static void main(String[] args) {

		GameDTO gameDTO1 = new GameDTO("Volleyball", "Outdoor", 6);
		GameDTO gameDTO2 = new GameDTO("Kabaddi", "Indoor", 7);
		GameDTO gameDTO3 = new GameDTO("Chowkabaara", "Indoor", 4);
		GameDTO gameDTO4 = new GameDTO("Cricket", "Outdoor", 11);
		GameDTO gameDTO5 = new GameDTO("Volleyball", "Outdoor", 12);

		boolean equals = gameDTO1.equals(gameDTO5);
		System.out.println(equals);

		Collection<GameDTO> games = new ArrayList<GameDTO>();
		games.add(gameDTO1);
		games.add(gameDTO2);

		boolean contains = games.contains(gameDTO5);
		System.out.println("Contains " + contains);

	}

}
