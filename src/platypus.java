public class platypus {
	private String name;
	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
		platypus perry = new platypus("perry");
	}
	public platypus(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
}
