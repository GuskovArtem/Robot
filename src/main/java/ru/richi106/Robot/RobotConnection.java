package ru.richi106.Robot;

public interface RobotConnection extends AutoCloseable {

	void moveRobotTo(int x, int y);

	void close();

}
