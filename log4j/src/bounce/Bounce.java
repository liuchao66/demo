package bounce;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Bounce {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new BounceFrame();
				frame.setSize(450, 350);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
			
		});
	}
	
	

}
