package user.pkg.frames;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

import user.pkg.interfaces.Jinterface;

public class Myjframe implements Jinterface{
	
	
	private JFrame j;	
	
	public Myjframe(String text, Integer width, Integer height) {
		this.j = new JFrame(text);
		this.j.setPreferredSize(new Dimension(width,height));
		this.j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.j.pack();
		this.j.setVisible(true);
	}
	
	public void add(Component comp) {
		this.j.add(comp);
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
	
	public void printDimension() {
		Dimension d = this.j.getBounds().getSize();
		System.out.println("\nWidth : "+String.valueOf(d.width)+"\nHeight : "+String.valueOf(d.height)+"\n");
	}
	
	public void lockSize() {
		this.j.setResizable(false);
	}
	
	public void unlockSize() {
		this.j.setResizable(true);
	}
}
