/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		JPanel quizPanel = new JPanel();
		JLabel quizLabel = new JLabel();
		quizWindow.setVisible(true);
        quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
        String tornado = "https://preservedbritishsteamlocomotives.files.wordpress.com/2017/07/60163.jpg?w=1100";
		// 2. create a variable of type "Component" that will hold your image
        	Component component = createImage(tornado);
		// 3. use the "createImage()" method below to initialize your Component
        	quizWindow.add(component);
        //	quizPanel.add(quizLabel);
        //	quizLabel.add(component);
		// 4. add the image to the quiz window
        	
		// 5. call the pack() method on the quiz window
        	quizWindow.pack();
		// 6. ask a question that relates to the image
        	String oof = JOptionPane.showInputDialog("What is the name of this locomotive? (no caps)");
		// 7. print "CORRECT" if the user gave the right answer
        	if(oof.equals("tornado")) {
        		System.out.println("CORRECT");
        	}else {
        		System.out.println("INCORRECT");
        	}
		// 8. print "INCORRECT" if the answer is wrong
        	
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        	quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line of code)
        	String next = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcFrL8nHpDemprO3AoEOdSxYwS2bAMTsjAT91H2efSdx4q7Spv5w";
        	component = createImage(next);
		// 11. add the second image to the quiz window
        	quizWindow.add(component);
		// 12. pack the quiz window
        	quizWindow.pack();
		// 13. ask another question
        	String oof2 = JOptionPane.showInputDialog("Is this the same locomotive (yes or no, no caps)");
        	if(oof2.equals("yes")) {
        		System.out.println("CORRECT");
        	}else {
        		System.out.println("INCORRECT");
        	}
		// 14+ check answer, say if correct or incorrect, etc.
        	
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





