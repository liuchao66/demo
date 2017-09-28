package bounce;

import java.awt.Component;

public class BallRunnable implements Runnable {

	private Component comp;
	
	private Ball ball;
	
	public static final int STEPS = 1000;
	
	public static final int DELAY = 5;
	
	public BallRunnable(Ball ball, Component comp) {
		this.comp = comp;
		this.ball = ball;
	}

	@Override
	public void run() {
		try {
			
			for (int i=1; i <= STEPS; i++) {
				ball.move(comp.getBounds());
				comp.paint(comp.getGraphics());
				Thread.sleep(DELAY);
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
