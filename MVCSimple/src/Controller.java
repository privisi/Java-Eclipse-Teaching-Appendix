
public class Controller {
	
	private Model m;
	private View v;
	
	public Controller(Model m, View v) {
		this.m = m;
		this.v = v;
		initController();
	}
	
	// initiate elements and listeners
	private void initController() {
		v.getMovingLabel().setLocation(m.getxPosition(), m.getyPosition());
		
		v.getxScrollBar().addAdjustmentListener(e -> moveXPosition());
		v.getyScrollBar().addAdjustmentListener(e -> moveYPosition());
	}
	
	private void moveXPosition() {
		m.setxPosition(v.getxScrollBar().getValue());
		v.getMovingLabel().setLocation(m.getxPosition(), m.getyPosition());
	}
	
	private void moveYPosition() {
		m.setyPosition(v.getyScrollBar().getValue());
		v.getMovingLabel().setLocation(m.getxPosition(), m.getyPosition());
	}
	
}
