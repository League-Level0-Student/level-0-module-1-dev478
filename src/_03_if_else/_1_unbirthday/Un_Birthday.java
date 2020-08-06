package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Un_Birthday {
public static void main(String[] args) {

	
	String birthday = JOptionPane.showInputDialog(null,"What is your birthday?");
	if (birthday.equals("08/06")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
	}
}
}