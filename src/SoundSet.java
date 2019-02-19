import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SoundSet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton woohoo = new JButton();
	JButton broken = new JButton();
	JButton marbles = new JButton();
	JLabel instructions = new JLabel();
	
	public static void main(String[] args) {
		new SoundSet().doStuff();
	}
	public void doStuff() {
		frame.add(panel);
		panel.add(woohoo);
		panel.add(broken);
		panel.add(marbles);
		panel.add(instructions);
		//panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		frame.setVisible(true);
		frame.setSize(500, 90);
		woohoo.setText("Play Woohoo!");
		broken.setText("Play broken piano");
		marbles.setText("Play marbles falling");
		instructions.setText("Press a button to play a sound.");
		woohoo.addActionListener(this);
		broken.addActionListener(this);
		marbles.addActionListener(this);
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==woohoo) {
			playSound("homer-woohoo.wav");
		}else if (e.getSource()==broken) {
			playSound("Piano_brokencrash-Brandondorf-1164520478.wav");
		}else if (e.getSource()==marbles) {
			playSound("marbles-daniel_simon.wav");
		}
	}
}
