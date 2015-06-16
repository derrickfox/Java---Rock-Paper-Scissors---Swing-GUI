import javax.swing.JOptionPane;

public class rockspaperscissors {
	public static void main(String[] args) {
		String nameString = JOptionPane.showInputDialog("Welcome to my Game.\n"+
	                                               "\n"+
				                                   "Please enter your name:");
		String choiceString = JOptionPane.showInputDialog("Hi " + nameString + ". Please enter your choice: \n"+
				                                          "scissors (0), rock (1), paper (2): ");
		int choice = Integer.parseInt(choiceString);
		
		int computer = (int)(Math.random() * 3);
		
		if (choice <  0 || choice > 2) {
			JOptionPane.showMessageDialog(null, "Sorry "+nameString+".\n"+
												"Please try again and enter only 0, 1, or 2");
		}
		
		
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

