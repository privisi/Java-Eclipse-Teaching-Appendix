import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class View {

	private JFrame frame;
	private JScrollBar xScrollBar;
	private JScrollBar yScrollBar;
	private JLabel movingLabel;

	public View() {
		// initialize
		frame = new JFrame("Scroll me");
		xScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 200, 5, 0, 325);
		yScrollBar = new JScrollBar(JScrollBar.VERTICAL, 200, 5, 0, 310);
		movingLabel = new JLabel("Hi");
		
		// set frame
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		// setup bounds
		xScrollBar.setBounds(0, 325, 350, 25);
		yScrollBar.setBounds(350, 0, 25, 325);
		movingLabel.setBounds(200, 200, 15, 15);
		
		// add elements
		frame.add(xScrollBar);
		frame.add(yScrollBar);
		frame.add(movingLabel);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JScrollBar getxScrollBar() {
		return xScrollBar;
	}

	public void setxScrollBar(JScrollBar xScrollBar) {
		this.xScrollBar = xScrollBar;
	}

	public JScrollBar getyScrollBar() {
		return yScrollBar;
	}

	public void setyScrollBar(JScrollBar yScrollBar) {
		this.yScrollBar = yScrollBar;
	}

	public JLabel getMovingLabel() {
		return movingLabel;
	}

	public void setMovingLabel(JLabel movingLabel) {
		this.movingLabel = movingLabel;
	}
	
	

}
