package ru.richi106.Robot;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Robot robot = new Robot(-1, -1, Direction.DOWN);

		System.out.println("X: " + robot.getX() + "; Y: " + robot.getY()
				+ "; Direction: " + robot.getDirection());
	}

}
