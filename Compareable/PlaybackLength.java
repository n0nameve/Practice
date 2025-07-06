package Compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Media implements Comparable<Media> {
	int length;
	String name;
	String Author;

	public int compareTo(Media other) {
		return this.length - other.length;
	}

}

class Movie extends Media {

	public Movie(String name, String Author, int length) {
		this.name=name;
		this.Author=Author;
		this.length = length;
	}
	
	public String formatLength() {
		int hour=length/3600;
		int min=(length%3600)/60;
		int sec=length%60;
		if(length>=3600) {
			return hour+"時"+min+"分"+sec+"秒";
		}else {
			return min+"分"+sec+"秒";
		}
	}

	public String toString() {
		return String.format("Movie Name: %s | Author: %s | length: %s", name, Author, formatLength());
	}
}

class Song extends Media {

	public Song(String name, String Author, int length) {
		this.name=name;
		this.Author=Author;
		this.length = length;
	}
	
	public String formatLength() {
		int min=length/60;
		int sec=length%60;
		return min+"分"+sec+"秒";
	}
	
	public String toString() {
		return String.format("Song Name: %s | Author: %s | length: %s", name, Author, formatLength());
	}
}

class Podcast extends Media {
	
	public Podcast(String name, String Author, int episode, int perlength) {
		this.name=name;
		this.Author=Author;
		this.length = episode * perlength;
	}
	
	public String formatLength() {
		int hour=length/3600;
		int min=(length%3600)/60;
		int sec=length%60;
		if(length>=3600) {
			return hour+"時"+min+"分"+sec+"秒";
		}else {
			return min+"分"+sec+"秒";
		}
	}
	
	public String toString() {
		return String.format("Podcast Name: %s | Author: %s | length: %s", name, Author, formatLength());
	}
}

public class PlaybackLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Media> mediaList = new ArrayList<>();

		mediaList.add(new Movie("Inception", "Christopher Nolan", 8880)); // 2h28m
		mediaList.add(new Song("Bohemian Rhapsody", "Queen", 354));        // 5m54s
		mediaList.add(new Podcast("TechTalk", "Alice", 10, 1800));         // 10集 × 30分鐘
		mediaList.add(new Song("Imagine", "John Lennon", 183));            // 3m03s
		mediaList.add(new Movie("The Matrix", "Wachowski Sisters", 8160)); // 2h16m
		mediaList.add(new Podcast("History Hour", "Bob", 5, 3600));        // 5集 × 1hr
		mediaList.add(new Song("Hey Jude", "The Beatles", 431));           // 7m11s
		mediaList.add(new Movie("Interstellar", "Christopher Nolan", 10140)); // 2h49m

		Collections.sort(mediaList);
		
		for(Media m:mediaList) {
			System.out.println(m);
		}
	}

}
