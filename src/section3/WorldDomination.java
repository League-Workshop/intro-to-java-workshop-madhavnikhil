package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog ("Do you know how to write code?");

		// 2. If they say "yes", tell them you can rule the world.
		if(input.equalsIgnoreCase("no")) {
			System.out.println(input + " You can't be a computer engineer but you can do something else that is great.");
		}
		else {
		JOptionPane.showMessageDialog (null, "You can be a computer engineer and get a lot of money." );
		}

		// 3. Otherwise, wish them good luck washing dishes.
		

	}
}

