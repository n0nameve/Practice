package practice;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{
	String name;
	int score;
	public Students(String name,int score) {
		this.name=name;
		this.score=score;
	}
	
	public int compareTo(Students other) {
		if(other.score==this.score) {
			return this.name.compareToIgnoreCase(other.name);
		}else {
			return other.score-this.score;
		}
	}
	
	public String toString() {
		return "學生："+name+" 成績："+score;
	}

}

public class Scorerank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Students> scores=new ArrayList<>();
		scores.add(new Students("Amy", 85));
		scores.add(new Students("Brian", 92));
		scores.add(new Students("Cindy", 78));
		scores.add(new Students("David", 92));
		scores.add(new Students("Eva", 88));
		
		Collections.sort(scores);
		
		for(Students s:scores) {
			System.out.println(s);
		}
	}

}
