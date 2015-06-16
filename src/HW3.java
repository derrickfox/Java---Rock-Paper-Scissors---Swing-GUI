/* Derrick Fox
 * CS 213 31015
 * HW3.java
 * February 13, 2014
 * Rocks, Paper, Scissors Game
 * 
 * This program mimics the "rocks, paper, scissors" game
 * It takes a user's choice and returns a win, lose, draw, or wrong input window
 * 
 */


// Import JOptionPane class 
import javax.swing.JOptionPane;

public class HW3 {
	public static void main(String[] args) {
		// Output window instructing user.
		String nameString = JOptionPane.showInputDialog("Welcome to my Game.\n"+
	                                               "\n"+
				                                   "Please enter your name:");
		String choiceString = JOptionPane.showInputDialog("Hi " + nameString + ". Please enter your choice: \n"+
				                                          "scissors (0), rock (1), paper (2): ");
		// Parse user input from string into an integer variable.
		int choice = Integer.parseInt(choiceString);
		
		// Assign a choice to the computer using the random method of the Math class
		// Then multiply it by three so that we receive outputs from 0 to 2 and parse it to an integer so we have just 
		// whole numbers to evaluate in the switch statement.
		int computer = (int)(Math.random() * 3);
		
		// A statement to capture incorrect user input.
		if (choice <  0 || choice > 2) {
			JOptionPane.showMessageDialog(null, "Sorry "+nameString+".\n"+
												"Please try again and enter only 0, 1, or 2");
		}
		
		// A statement to make the decisions on win, loss, or draw. 
		// All decisions are coupled with output windows to report the results to the user. 
		switch (choice) {
			case 0: if (computer == 0) {
						JOptionPane.showMessageDialog(null, "The computer is scissors. You are scissors too.\n"+
															 "DRAW!");
			}
						else if (computer == 1) {
							JOptionPane.showMessageDialog(null, "The computer is rock. You are scissors.\n"+
									 "You lost!");
						}
							else if (computer == 2) {
								JOptionPane.showMessageDialog(null, "The computer is paper. You are scissors.\n"+
										 "You won!");
							}
							break;
			case 1: if (computer == 0) {
				JOptionPane.showMessageDialog(null, "The computer is scissors. You are rock.\n"+
						 "You won!");
										}
						else if (computer == 1) {
						JOptionPane.showMessageDialog(null, "The computer is rock. You are rock too.\n"+
						"DRAW!");
						}
							else if (computer == 2) {
							JOptionPane.showMessageDialog(null, "The computer is paper. You are rock.\n"+
								 "You lost!");
							}
							break;
			case 2: if (computer == 0) {
				JOptionPane.showMessageDialog(null, "The computer is scissors. You are paper.\n"+
						 "You won!");
										}
						else if (computer == 1) {
						JOptionPane.showMessageDialog(null, "The computer is rock. You are paper.\n"+
						"You lost!");
						}
							else if (computer == 2) {
							JOptionPane.showMessageDialog(null, "The computer is paper. You are paper too.\n"+
								 "DRAW!");
							}
							break; 

						}
			}
					
}

