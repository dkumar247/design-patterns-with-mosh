package com.deepa.dp.state.abuse;

public class RunningState implements State {

	private Stopwatch stopwatch;
	
	public RunningState(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		stopwatch.setCurrentState(new StoppedState(stopwatch));
		System.out.println("Stopped");
	}

}
