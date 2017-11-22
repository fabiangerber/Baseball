package baseball;

import java.util.Observer; 

public class Pitcher implements Observer{
//	public Pitcher(Ball ball) {
//		ball.addObserver(this);
//	}

	@Override
	public void update(java.util.Observable o, Object arg) {

		if (arg instanceof BallEventArgs) {
			BallEventArgs ballEventArgs = (BallEventArgs) arg;
			if ((ballEventArgs.distance < 95) && (ballEventArgs.trajectory < 60)) {
				System.out.println("Pitcher: I caught the ball.");
			}
			else {
				System.out.println("Pitcher: I covered first base.");
			}
		}
	}

}
