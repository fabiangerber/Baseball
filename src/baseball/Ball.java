package baseball;

import java.util.Observable;

public class Ball extends Observable {

	Ball() {
		this.addObserver(new Pitcher());
		this.addObserver(new Fan());
	}

	public void OnBallInPlay(BallEventArgs e) {
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(e);
		}

	}

}