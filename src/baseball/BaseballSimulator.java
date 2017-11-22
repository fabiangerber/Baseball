package baseball;

public class BaseballSimulator {
	private Ball ball;

	public BaseballSimulator() {
		ball = new Ball();
		
	}

	public void PlayBall(int distance, int trajectory) {
		BallEventArgs ballEventArgs = new BallEventArgs(distance, trajectory);
		ball.OnBallInPlay(ballEventArgs);
	}

}
