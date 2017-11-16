package baseball;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Ball {

	public EventHandler<ActionEvent> BallInPlay; // TODO is this correct?

	public void OnBallInPlay(BallEventArgs e) {
		// EventHandler ballInPlay = BallInPlay; // WHAAAT??? ball vs. Ball?
		// if (ballInPlay != null) {
		// ballInPlay(this, e); // Whats this?
		// }
	}

}