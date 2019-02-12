import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	// JPanel panel;
	JButton button1;
	// JTextField text;

	public static void main(String[] args) {
		new FortuneCookie().showButton();

	}

	public void showButton() {

		frame = new JFrame();

		button1 = new JButton();

		frame.add(button1);

		frame.setVisible(true);
		button1.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WOOHOO!");
		int random = new Random().nextInt(5);
		if (random == 0) {
			System.out.println("Fortune 1");
		} else if (random == 1) {
			System.out.println("Fortune 2");
		} else if (random == 2) {
			System.out.println("Fortune 3");
		} else if (random == 3) {
			System.out.println("Fortune 4");
		} else if (random == 4) {
			System.out.println("Fortune 5");
		}
	}
}
