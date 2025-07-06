package Compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Player implements Comparable<Player> {
	String name;
	int wins;
	int losses;
	double rate;

	public Player(String name, int wins, int losses) {

		this.name = name;
		this.wins = wins;
		this.losses = losses;
		rate = (double) wins / (double) (wins + losses);
	}

	@Override
	public int compareTo(Player other) {
		int CompareRate = Double.compare(other.rate, this.rate);
		if (CompareRate != 0) {
			return CompareRate;
		} else {
			int thisTotal = this.wins + this.losses;
			int otherTotal = other.wins + other.losses;
			if (thisTotal != otherTotal) {
				return otherTotal - thisTotal;
			} else {
				return this.name.compareToIgnoreCase(other.name);
			}
		}

	}

	public String toString() {

		return name + ", win：" + wins + ", lose：" + losses + "\n rate：" + rate * 100 + "%";
	}
}

public class RankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Player> players = new ArrayList<>();

		players.add(new Player("Alice", 8, 2));
		players.add(new Player("Bob", 9, 1));
		players.add(new Player("Charlie", 9, 1));
		players.add(new Player("David", 5, 0));
		players.add(new Player("Eva", 7, 3));
		players.add(new Player("Frank", 9, 1));
		players.add(new Player("Grace", 6, 0));
		players.add(new Player("Helen", 3, 2));

		Collections.sort(players);

		for (int i = 0; i < players.size(); i++) {
			System.out.println("#" + (i + 1) + " " + players.get(i));
		}
	}

}
