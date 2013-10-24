import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ListenerMouse extends JPanel implements MouseListener {

	public void mouseClicked(MouseEvent e) {

		// System.out.println(e.getX() + " " + e.getY());

		if (Error.getInstance().isShowError()) {
			Error.getInstance().setShowError(false);
		} else {
			if (e.getY() > 135 & e.getY() < 174 & e.getX() > 158
					& e.getX() < 358) {
				Mine.getInstance().manualMine();
			} else if (e.getY() > 235 & e.getY() < 274 & e.getX() > 159
					& e.getX() < 357) {
				Convert.getInstance().manualConvert();
			} else if (e.getY() > 351 & e.getY() < 390 & e.getX() > 13
					& e.getX() < 233) {
				Rig.getInstance().upgradeProcessor();
			} else if (e.getY() > 350 & e.getY() < 390 & e.getX() > 309
					& e.getX() < 528) {
				Broker.getInstance().addNewbieBroker();
			}

		}

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

}
