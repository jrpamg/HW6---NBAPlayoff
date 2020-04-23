import javax.swing.JPanel;
import java.awt.*;

public class NBAcourtPanel extends JPanel{

	private int w, h;

	public NBAcourtPanel(NBATeam team) {
		setBackground(Color.LIGHT_GRAY);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.w = 1500;
		this.h = 800;
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, w, h); //width, height
		
		g.setColor(Color.WHITE);
		g.drawOval(-w/4, 0, w/2, h);
		g.drawOval(1125, 0, w/2, h);
		g.drawLine(w/2, 0, w/2, h);
		
		g.setColor(Color.RED);
		g.fillOval((w/2)-50, (h/2)-100, 100, 100);
	}




}


