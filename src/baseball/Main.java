package baseball;

public class Main {

	public static void main(String[] args) {

		BaseballSimulator simulator = new BaseballSimulator();

		// Catch ball
		int distance = 60;
		int trajectory = 30;
		simulator.PlayBall(distance, trajectory);
		System.out.println("\n");		

		// Homerun
		distance = 100;
		trajectory = 50;
		simulator.PlayBall(distance, trajectory);
		System.out.println("\n");

		// Homerun
		distance = 440;
		trajectory = 50;
		simulator.PlayBall(distance, trajectory);
		System.out.println("\n");

	}

}
