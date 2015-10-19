package ru.richi106.Robot;

public class RobotConnectionManagerImpl implements RobotConnectionManager {

    private Robot robot;

    public RobotConnectionManagerImpl(Robot robot) {
        this.robot = robot;
    }

    public RobotConnectionManagerImpl() {
        this.robot = new Robot(0, 0, Direction.UP);
    }

    public RobotConnection getConnection() {
        if (robot == null) {
            throw new RobotConnectionException("connection falied.");
        }
        return robot;
    }

}
