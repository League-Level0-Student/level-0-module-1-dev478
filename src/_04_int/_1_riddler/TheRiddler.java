package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String n = JOptionPane.showInputDialog("Who makes it, has no need of it "+
		"\nWho buys it, has no use For it." +
		"\nWho uses it can neither see nor feel it."+
		"\nWhat is it?" );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(n.equalsIgnoreCase("coffin")) {
System.out.println("Correct!");
score  ++;

}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	System.out.println("Wrong! The correct answer is: coffin.");
	score --;
}
		// 6. Add some more riddles
String s = JOptionPane.showInputDialog("What has many keys but can't open a single lock? \r\n" + 
		"\r\n" + 
		"");
if(s.equalsIgnoreCase("piano")) {
	System.out.println("Correct!");
	score ++;
}
else {
	System.out.println("Wrong! The correct answer is: piano.");
}
String r = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
if(r.equalsIgnoreCase("coin")) {
System.out.println("Correct!");	
score ++;
}
else {
	System.out.println("Wrong! The correct answer is: coin.");
	score --;
}

		// 2. Make a pop up to show the score.
		System.out.println("Your final score is:" + score);
		
		
	}
}

