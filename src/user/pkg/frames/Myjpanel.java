package user.pkg.frames;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

import user.pkg.interfaces.Jinterface;

public class Myjpanel implements Jinterface{
	
	private Mybackroundjpanel j;
	
	public Myjpanel(Integer rows, Integer columns,String imgname) {
		j = new Mybackroundjpanel(imgname);
		j.setLayout(new GridLayout(rows,columns));
		j.setVisible(true);
	}
	
	public void add(Component comp) {
		j.add(comp);
	}

	@Override
	public void setAllVisible() {
		// TODO Auto-generated method stub
		this.j.setVisible(true);
	}

	@Override
	public void setAllHidden() {
		// TODO Auto-generated method stub
		this.j.setVisible(false);
	}
	
	public JPanel getPanel() {
		return this.j;
	}

	@Override
	public void setBrColor(Color inp) {
		// TODO Auto-generated method stub
		this.j.setBackground(inp);
	}

	@Override
	public void setVisible(Integer index) {
		// TODO Auto-generated method stub
	    throw new UnsupportedOperationException("Invalid operation! Use setAllVisible() instead.");		
	}

	@Override
	public void setHidden(Integer index) {
		// TODO Auto-generated method stub
	    throw new UnsupportedOperationException("Invalid operation! Use setALlHidden() instead.");

	}

}
