import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener  {
	JFrame frame = new JFrame();
	public static void main(String[] args) {
		new SensitiveKeyboard().keyboard();
	}
	public void keyboard() {
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//speak("ouch stop that");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak("ouch that hurts please stop or i will die no no no no no no no no no waaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//speak("ouch stop that");
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say "+words).waitFor();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
