class Ball{
	public event EventHandler BallInPlay;
	public void OnBallInPlay(BallEventArgs e){
		EventHandler ballInPlay = BallInPlay;
		if(ballInPlay != null){
			ballInPlay(this, e);
		}
	}
}