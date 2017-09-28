package bounce;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounceFrame extends JFrame {

	private BallComponent comp;
	
	public static final int STEPS = 1000;
	
	public static final int DELAY = 3;
	
	public BounceFrame() {
		setTitle("Bounce");
		
		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();
			}
			
		});
		
		addButton(buttonPanel, "Close", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}

	public void addBall() {
			Ball ball = new Ball();
			comp.add(ball);
			
			Runnable r = new BallRunnable(ball, comp);
			Thread t = new Thread(r);
			t.start();
	}

	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton();
		c.add(button);
		button.addActionListener(listener);
	}
	
}
