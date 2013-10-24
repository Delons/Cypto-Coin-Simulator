import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DecimalFormat;

import javax.swing.JPanel;

public class Paint extends JPanel {

	private static Paint paint;

	public static Paint getInstance() {
		if (paint == null) {
			paint = new Paint();
		}
		return paint;
	}

	private int lastTime, currentTime, fps;

	Font fntTitle = new Font("Ariel", Font.PLAIN, 40);
	Font fntSub = new Font("Ariel", Font.PLAIN, 15);
	Font ftnOut = new Font("Ariel", Font.PLAIN, 25);
	Font ftnLabel = new Font("Ariel", Font.PLAIN, 20);

	Color clrButtonOutline = new Color(99, 93, 93);
	Color clrButtonFill = new Color(150, 141, 142);

	DecimalFormat decM = new DecimalFormat("0.00");

	private Rig rig = Rig.getInstance();

	public void paintComponent(Graphics g) {

		GUI gui = GUI.getInstance();
		
		lastTime = currentTime;
		currentTime = (int) System.currentTimeMillis();
		if (currentTime - lastTime != 0) {
			fps = 1000 / (currentTime - lastTime);
		}

		super.paintComponent(g);

		// Background
		g.setColor(new Color(84, 190, 255));
		g.fillRect(0, 0, 10000, 10000);

		// Title
		g.setColor(Color.BLACK);
		g.setFont(fntTitle);
		g.drawString("Cypto-Coin Simulator", 125, 40);

		// Draw FPS
		g.setColor(Color.BLACK);
		g.setFont(fntSub);
		g.drawString("FPS: " + fps, 5, 15);

		DecimalFormat dec = new DecimalFormat("0.00");

		// Draw Coin Amount
		g.setFont(ftnOut);
		g.drawString(
				"Cypto-Count: " + dec.format(Clicker.getInstance().getCoins()),
				25, 90);

		// Draw Mine Button Outline
		g.setColor(clrButtonOutline);
		g.drawRect(150, 105, 200, 40);

		// Fill Mine Button
		g.setColor(clrButtonFill);
		g.fillRect(151, 106, 199, 39);

		// Draw Mine Button Text
		g.setColor(Color.BLACK);
		g.setFont(ftnLabel);
		g.drawString("Mine Coins", 200, 130);

		// Draw Manual Coins Per Second
		g.setFont(fntSub);
		g.setColor(Color.BLACK);
		g.drawString("Manual Coins Per Second: "
				+ Mine.getInstance().getManualAmount(), 365, 120);

		// Automatic Draw Coins Per Second
		g.setFont(fntSub);
		g.setColor(Color.BLACK);
		g.drawString(
				"Auto Coins Per Second: "
						+ decM.format(Mine.getInstance().getCps()), 365, 140);

		// Draw Money Amount
		g.setFont(ftnOut);
		g.drawString(
				"Money: $" + decM.format(Clicker.getInstance().getMoney()), 25,
				190);

		// Draw Convert Button Outline
		g.setColor(clrButtonOutline);
		g.drawRect(150, 205, 200, 40);

		// Fill Convert Button
		g.setColor(clrButtonFill);
		g.fillRect(151, 206, 199, 39);

		// Draw Convert Button Text
		g.setColor(Color.BLACK);
		g.setFont(ftnLabel);
		g.drawString("Convert", 215, 230);

		// Draw Conversions Per Second
		g.setFont(fntSub);
		g.setColor(Color.BLACK);
		g.drawString("Automatic Conversions Per Second: "
				+ Convert.getInstance().getAcps(), 150, 275);

		// Draw Market Value
		g.setFont(fntSub);
		g.setColor(Color.BLACK);
		g.drawString("Current Market Rate: $" + Market.getInstance().getRate()
				+ " per coin", 170, 294);

		// Draw Upgrade Buttons

		// Processor

		g.setColor(clrButtonOutline);
		g.drawRect(5, 320, 220, 40);
		g.setColor(clrButtonFill);
		g.fillRect(6, 321, 219, 39);

		g.setColor(Color.BLACK);
		g.setFont(ftnLabel);
		g.drawString("Processor " + rig.getProcessorLvl() + "/10 - $"
				+ rig.processorPrice[rig.getProcessorLvl()], 8, 345);

		// Ram

		g.setColor(clrButtonOutline);
		g.drawRect(5, 370, 220, 40);
		g.setColor(clrButtonFill);
		g.fillRect(6, 371, 219, 39);

		g.setColor(Color.BLACK);
		g.setFont(ftnLabel);
		g.drawString(
				"Ram " + rig.getRamLvl() + "/10 - $"
						+ rig.ramPrice[rig.getRamLvl()], 8, 395);

		// Draw Broker Buttons

		// Newbie Broker

		g.setColor(clrButtonOutline);
		g.drawRect(300, 320, 220, 40);
		g.setColor(clrButtonFill);
		g.fillRect(301, 321, 219, 39);

		g.setColor(Color.BLACK);
		g.setFont(ftnLabel);
		g.drawString("Newbie Broker - "
				+ Broker.getInstance().getNewbieBrokerAmt() + " - $"
				+ (Broker.getInstance().getNewbieBrokerAmt() + 1) * 20, 305,
				345);

		/**
		 * Error Message
		 * Width is 50% of the GUI, 25% Margin on Each Side
		 * Height is 20%, 40% Margin Top and Bottom
		 */

		if (Error.getInstance().isShowError()) {
			g.setColor(Color.RED);
			g.drawRect(50, 100, 450, 100);
			g.setColor(Color.WHITE);
			g.fillRect(51, 101, 449, 99);
			g.setColor(Color.BLACK);
			g.setFont(ftnLabel);
			g.drawString(Error.getInstance().getErrorMessage(), 55, 150);
		}

	}

}
