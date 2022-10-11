package com.xworkz.other;

import com.xworkz.boot.Song;

public class SongRunner {

	public static void main(String[] args) {
		Song audioSong=new Song();
		
		audioSong.name="Ninna Gungalle";
		audioSong.language="Kannada";
		audioSong.singer="Adhvik";
		audioSong.lyricst="Naveen";
		audioSong.type="album song";
		
		System.out.println(audioSong.name);
		System.out.println(audioSong.language);
		System.out.println(audioSong.singer);
		System.out.println(audioSong.lyricst);
		System.out.println(audioSong.type);
		
		

	}

}
