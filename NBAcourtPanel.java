import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class NBAcourtPanel extends JPanel{

	private NBATeam team;
	private int w, h;//original is 800, 400 respectively
	
	public NBAcourtPanel(NBATeam team) {
		setBackground(Color.LIGHT_GRAY);
		this.team = team;
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
		
		g.setColor(Color.BLACK);
		Font personalFont = new Font("Times New Roman",Font.BOLD, 18);
		g.setFont(personalFont);

		for(int i = 0; i < this.team.getNumOfPlayer(); i++) {
			g.drawString(this.team.getPlayer(i), 1200, 30 + (i*30));
		}
		
	}
	
}


