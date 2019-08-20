package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_runner {
public static void main(String[] args) {
	Popcorn popcorn = new Popcorn(JOptionPane.showInputDialog("What flavor popcorn would you like?"));
Microwave microwave = new Microwave();
microwave.putInMicrowave(popcorn);
String x = JOptionPane.showInputDialog("How long would you like to cook it? (minutes)");
int y = Integer.parseInt(x);
microwave.setTime(y);
microwave.startMicrowave();
popcorn.eat();
}
}
