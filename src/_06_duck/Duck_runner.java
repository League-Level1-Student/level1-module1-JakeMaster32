package _06_duck;

public class Duck_runner {
public static void main(String[] args) {
	String favoritefood = "bread";
	int numberoffriends = 0;
	Duck Daniel = new Duck(favoritefood, numberoffriends);
	Daniel.die();
}
}
