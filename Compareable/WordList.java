package Compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Word implements Comparable<Word>{
	String text;
	
	public Word(String text) {
		this.text=text;
	}
	
	@Override
	public int compareTo(Word other) {
		if(this.text.length()==other.text.length()) {
			return this.text.compareToIgnoreCase(other.text);
		}else {
			return this.text.length()-other.text.length();
		}
	}

	@Override
	public String toString() {
	    return text;
	}
}

public class WordList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Word> words = new ArrayList<>();
		words.add(new Word("banana"));
		words.add(new Word("Apple"));
		words.add(new Word("kiwi"));
		words.add(new Word("grape"));
		words.add(new Word("orange"));
		words.add(new Word("fig"));
		
		Collections.sort(words);
		
		for(Word w:words) {
			System.out.println(w);
		}
	}

}
