package Compareable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student other) {
		if(this.score!=other.score) {
			return other.score-this.score;
		}else {
			return this.name.compareToIgnoreCase(other.name);
		}
	}
	
	@Override
	public String toString(){
		return name+":"+score;
	}
}

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 95));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 88));
        
        Collections.sort(students);
        
        System.out.println("排序後的學生名單：");
        for(Student s:students) {
        	System.out.println(s);
        }
	}

}
