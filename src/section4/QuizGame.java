package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;  
		
		// 2.  Ask the user a questiion
		String input = JOptionPane.showInputDialog("If Tyler has 24 cookies, then I give him 6 more cookies, then Tyler wants to distribute all the cookies to Igor and Gavin then how many cookies will each of Igor and Gavin will have?");
		 
		// 3.  Use an if statement to check if their answer is correct
	    if(input.equalsIgnoreCase("15")) {
	    		System.out.println("answer is correct");
	    		// 4.  if the user's answer was correct, add one to their score 
	    		score = score + 3;
	    }
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String input2 = JOptionPane.showInputDialog("Say Nikhil, Tyler, Gavin, and Igor are going to Disney World and all of us get a 4 day ticket with 1 park per day and it costs $436 per person, then how much money does it cost all 4 of us?");
		if(input2.equalsIgnoreCase("1744")) {
			System.out.println("answer is correct");
			score = score + 3;
			}
		{
		String input3 = JOptionPane.showInputDialog("Now if the whole trip cost is $5,691 knowing that the cost of the ticket is $1744 and let the cost of the hotel be x and the flight be y, then find the value of x and y considering that y is 55 more than x?");
			if(input3.equalsIgnoreCase()
			
			
		}
		  // 6.  After all the questions have been asked, print the user's score 
		
	}
}
