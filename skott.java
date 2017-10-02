import javax.swing.*;

/* Vad? visar olika värder
	Vem av? Kieran
	När? 2:e Oktober 2017
*/

public class Skott {
	public static void main (String[] arg) {
		String s = JOptionPane.showInputDialog(
			"Skriv ett årtal");

		int år = Integer.parseInt(s);
		if ((år % 4 == 0 && år % 100 != 0 || år % 400 == 0))
			JOptionPane.showMessageDialog(null, "Skottår");
		else
			JOptionPane.showMessageDialog(null, "Inte skottår")

	}

}
