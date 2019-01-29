import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setX(0);
		rob.setY(300);
		rob.setSpeed(90);
		rob.setPenWidth(3);
		rob.penDown();
		rob.miniaturize();
		for(int i=0;i<10;i++) {
			String oof = JOptionPane.showInputDialog("What size do you want your house: small, medium, or large?");
			String red = JOptionPane.showInputDialog("What number of red do you want? (0-255)");
			String green = JOptionPane.showInputDialog("What number of green do you want? (0-255)");
			String blue = JOptionPane.showInputDialog("What number of blue do you want? (0-255)");
			int red2 = Integer.parseInt(red);
			int green2 = Integer.parseInt(green);
			int blue2 = Integer.parseInt(blue);
			if (oof.equals("small")) {
				drawPeakedHouse(60, red2, green2, blue2);
			}else if(oof.equals("medium")) {
				drawPeakedHouse(120, red2, green2, blue2);
			}else if(oof.equals("large")) {
				drawFlatHouse(250, red2, green2, blue2);
			}
		}
		}
	static void drawFlatHouse(int height, int red, int green, int blue) {
		rob.setAngle(0);
		rob.setPenColor(red, green, blue);
		rob.move(height);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 250, 0);
		rob.move(30);
	}
	static void drawPeakedHouse(int height, int red, int green, int blue) {
		rob.setAngle(0);
		rob.setPenColor(red, green, blue);
		rob.move(height);
		rob.turn(30);
		rob.move(30);
		rob.turn(120);
		rob.move(30);
		rob.turn(30);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 250, 0);
		rob.move(30);
	}
}
