import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton a = new JButton();
	JButton b = new JButton(); 
	JButton c = new JButton();
	JLabel instruct = new JLabel();
	public static void main(String[] args) {
		new CutenessTV().doSomething();
	}
	public void doSomething() {
		frame.add(panel);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(instruct);
		a.setText("Play Ducks");
		b.setText("Play Frog");
		c.setText("Play oof");
		frame.setVisible(true);
		frame.setSize(400, 90);
		instruct.setText("Press a button to play a video.");
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==a) {
			showDucks();
		}else if (e.getSource()==b) {
			showFrog();
		}else if (e.getSource()==c) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
