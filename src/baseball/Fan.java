package baseball;

import java.util.Observable;
import java.util.Observer; 

public class Fan implements Observer {
//	public Fan(Ball ball){
//		ball.addObserver(this);
//	}

	@Override
	public void update(Observable o, Object arg) {

		if (arg instanceof BallEventArgs) {
			BallEventArgs ballEventArgs = (BallEventArgs) arg;
			if ((ballEventArgs.distance > 400) && (ballEventArgs.trajectory > 30)) {
				System.out.println("Fan: Home run! I'm going for the ball!");
			}
			else {
				System.out.println("Fan: Woo-hoo! Yeah!");
			}
		}
	}

}
