package se.mah.k3.pfi2.project.bus.view;

import javax.swing.JPanel;

import se.mah.k3.pfi2.project.Frame.controller.ModuleInterface;
import java.awt.Color;

public class BusPanel extends JPanel implements ModuleInterface{

	/**
	 * Create the panel.
	 */
	public BusPanel() {
		setBackground(Color.PINK);
		
	}

	@Override
	public int getPreferedPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPreferdNumberOfRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPreferdHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}