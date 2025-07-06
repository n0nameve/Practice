package Compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
	String title;
	String author;
	int year;
	
	public Book(String title,String author,int year) {
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	@Override
	public int compareTo(Book other) {
		if(this.year==other.year) {
			return this.title.compareToIgnoreCase(other.title);
		}else {
			return other.year-this.year;
		}
	}
	
	public String toString() {
		return title+"-"+author+"("+year+")";
	}
}

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> books = new ArrayList<>();
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
		books.add(new Book("1984", "George Orwell", 1949));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
		books.add(new Book("Brave New World", "Aldous Huxley", 1932));
		books.add(new Book("Animal Farm", "George Orwell", 1945));
		books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
		books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
		books.add(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
		books.add(new Book("The Great Gatsby", "Someone Else", 1925));
		
		Collections.sort(books);
		
		for(Book b:books) {
			System.out.println(b);
		}
	}

}
