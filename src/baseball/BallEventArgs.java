package baseball;

public class BallEventArgs {
	
	public int trajectory;
    public int distance;
    
	public BallEventArgs(int distance, int trajectory) {
		this.trajectory = trajectory;
        this.distance = distance;
	}

}
