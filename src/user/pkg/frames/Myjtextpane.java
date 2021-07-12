package user.pkg.frames;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import user.pkg.interfaces.Jinterface;

public class Myjtextpane implements Jinterface {
		
	private List<JTextPane> paneList;	
	
	public Myjtextpane(Integer amount){
		this.paneList = new ArrayList<JTextPane>();
		init(amount);
	}
	
	public Myjtextpane() {
		JTextPane tmp = new JTextPane();
		tmp.setText("0");
		this.paneList.add(tmp);
	}
	
	public void init(Integer amount) {
		for(int c=0; c < amount; c++) {
			JTextPane tmp = new JTextPane();
			StyledDocument doc = tmp.getStyledDocument();
			SimpleAttributeSet center = new SimpleAttributeSet();
			StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
			doc.setParagraphAttributes(0, 0, center, false);
			tmp.setBackground(null);
			tmp.setText("0");
			tmp.setVisible(true);
			tmp.setEnabled(false);
			tmp.setOpaque(false);
			this.paneList.add(tmp);
		}
	}
	
	public List<JTextPane> getPaneList() {
		return this.paneList;
	}
	
	public JTextPane get(Integer index) {
		return this.paneList.get(index);
	}
	
	public Integer getLen() {
		return (Integer) this.paneList.size();
	}

	@Override
	public void setBrColor(Color inp) {
		// TODO Auto-generated method stub
		for ( int c = 0; c < this.paneList.size(); c++) {
			this.paneList.get(c).setBackground(inp);
		}
	}
	
	public void setCharacterSize(Integer sz) {
		for ( int c = 0; c < this.paneList.size(); c++) {
			this.paneList.get(c).setFont(new Font("Monospaced",Font.BOLD, sz));
		}
	}
	
	public Font getFont() {
		return this.paneList.get(0).getFont();
	}
	
	public void setString(Integer index, String text) {
		this.paneList.get(index).setText(text);
	}
	
	@Override
	public void setAllVisible() {
		// TODO Auto-generated method stub
		for(int c = 0; c < paneList.size(); c++) {
			this.paneList.get(c).setVisible(true);
		}
	}

	@Override
	public void setAllHidden() {
		// TODO Auto-generated method stub
		for(int c = 0; c < paneList.size(); c++) {
			this.paneList.get(c).setVisible(false);
		}
	}

	@Override
	public void setVisible(Integer index) {
		// TODO Auto-generated method stub
		this.paneList.get(index).setVisible(true);
	}

	@Override
	public void setHidden(Integer index) {
		// TODO Auto-generated method stub
		this.paneList.get(index).setVisible(false);
	}
	
	public void setStringColor(Integer index,Color c) {
		this.paneList.get(index).setDisabledTextColor(c);
	}
	
	public void setAllStringColor(Color color) {
		for(int c = 0; c < paneList.size(); c++) {
			this.paneList.get(c).setDisabledTextColor(color);;
		}
	}
	
	public Color getCurrentColor() {
		return this.paneList.get(0).getDisabledTextColor();
	}
	
	public void enableBorder(Color color) {
		for(int c = 0; c < paneList.size(); c++) {
			this.paneList.get(c).setBorder(BorderFactory.createLineBorder(color));
		}
	}
	
	public void disableBorder() {
		for(int c = 0; c < paneList.size(); c++) {
			this.paneList.get(c).setBorder(null);
		}
	}
	
}
