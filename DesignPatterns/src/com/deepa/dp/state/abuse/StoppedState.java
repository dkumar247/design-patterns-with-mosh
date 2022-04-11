package com.deepa.dp.state.abuse;

public class StoppedState implements State {

	private Stopwatch stopwatch;
	
	public StoppedState(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub

		stopwatch.setCurrentState(new RunningState(stopwatch));
		System.out.println("Running");
	}

}
