import java.awt.*;
import java.util.TimerTask;
import java.util.Timer;

import javax.swing.*;

public class GUI extends JPanel {

	private static GUI instance;

	public static GUI getInstance() {
		if (instance == null) {
			instance = new GUI();
		}
		return instance;
	}

	JFrame f = new JFrame("Crypto-Coin Simulator - "
			+ Clicker.getInstance().getVersionNumber());

	Timer redraw = new Timer();
	Timer mine = new Timer();
	
	int guiWidth = 600, guiHeight = 600;

	public void drawGUI() {

		redraw.schedule(draw, 16, 16);
		mine.schedule(auto, 1000, 1000);

		f.setSize(guiWidth, guiHeight);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		ListenerMouse mouse = new ListenerMouse();

		f.addMouseListener(mouse);

		f.add(Paint.getInstance());

	}

	TimerTask draw = new TimerTask() {
		public void run() {
			f.repaint();

			if (0 + (int) (Math.random() * ((2500 - 0) + 1)) == 50) {
				Market.getInstance().changeRate();
			}
		}
	};

	TimerTask auto = new TimerTask() {
		public void run() {
			Mine.getInstance().autoMine();
			Convert.getInstance().autoConvert();
		}
	};

	public int getGuiWidth() {
		return guiWidth;
	}

	public void setGuiWidth(int guiWidth) {
		this.guiWidth = guiWidth;
	}

	public int getGuiHeight() {
		return guiHeight;
	}

	public void setGuiHeight(int guiHeight) {
		this.guiHeight = guiHeight;
	}
	
	

}
