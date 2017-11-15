package baseball;

public class BaseballSimulator {
	private static Ball ball = new Ball();
    private Pitcher pitcher;
    private Fan fan;
    public BaseballSimulator()
    {
        pitcher = new Pitcher(ball);
        fan = new Fan(ball);
    }
    public static void PlayBall(int trajectory, int distance)
    {
        BallEventArgs ballEventArgs = new BallEventArgs(trajectory, distance);
        ball.OnBallInPlay(ballEventArgs);
    }

}
