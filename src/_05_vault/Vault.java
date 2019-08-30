package _05_vault;
import java.util.Random;

public class Vault {
	
	static int code = 0;
	
	boolean trycode(int x){
		if (x == code) {
			return true;
		}
		else {
		return false;}
		
	}
public static void main(String[] args) {
	Random rand = new Random();
	code = rand.nextInt(1000001);
	Vault vault = new Vault();
System.out.println(vault.trycode(1532411));

}

}
