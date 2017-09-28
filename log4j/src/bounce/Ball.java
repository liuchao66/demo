package bounce;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ball {

	private static final int XSIZE = 15;
	
	private static final int YSIZE = 15;
	
	private double x = 0;
	
	private double y = 0;
	
	private double dx = 1;
	
	private double dy = 1;
	
	public void move(Rectangle2D bounds) {
		
		x += dx;
		y += dy;
		
		// 到达窗口X轴最小边界
		if (x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
		}
		
		// 到达窗口X轴最大边界
		if (x + XSIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX() - XSIZE;
			dx = -dx;
		}
		
		// 到达窗口Y轴最小边界
		if (y < bounds.getMinY()) {
			y = bounds.getMinY();
			dy = -dy;
		}
		
		// 到达窗口Y轴最大边界
		if (y + YSIZE >= bounds.getMaxY()) {
			y = bounds.getMaxY() - YSIZE;
			dy = -dy;
		}
		
	}

	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	}
	
}
