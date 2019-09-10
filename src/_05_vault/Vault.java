package _05_vault;

import java.util.Random;

public class Vault {

	static int code = 0;

	public Vault() {
		Random rand = new Random();
		code = rand.nextInt(1000001);
		System.out.println(code);
	}

	boolean trycode(int x) {
		if (x == code) {
			return true;
		} else {
			return false;
		}

	}

}
