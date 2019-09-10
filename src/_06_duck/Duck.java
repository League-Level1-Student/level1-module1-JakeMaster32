package _06_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;


	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
		Duck.die();
	}

	public static void die() {
		System.out.println("Daniel died");
	}
}
