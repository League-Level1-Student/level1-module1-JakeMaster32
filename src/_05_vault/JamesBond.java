package _05_vault;

public class JamesBond {
	static JamesBond james = new JamesBond();

	static int findcode(Vault vault) {
		for (int y = 0; y < 1000000; y++) {
			boolean z = vault.trycode(y);
			if (z == true) {
				return y;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a = 0;
		Vault v = new Vault();
		a = JamesBond.findcode(v);
		System.out.println(a);
	}

}