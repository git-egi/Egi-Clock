package user.pkg.main;

import java.awt.Color;

import java.util.concurrent.TimeUnit;

import user.pkg.frames.Myjframe;
import user.pkg.frames.Myjpanel;
import user.pkg.frames.Myjtextpane;
import user.pkg.time.Time;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String brimgpath = "/backround.jpg";
		
		Myjframe m = new Myjframe("Egi Clock Version 1.0",340,100);
		
		m.lockSize();
				
		Myjpanel p = new Myjpanel(1,8,brimgpath);
				
				
		Myjtextpane txt = new Myjtextpane(8);
		
		
		for(int c = 0; c < txt.getLen(); c++ ) {
			p.add(txt.get(c));
		}

		m.add(p.getPanel());
		
		
		/*-------------------------------------------------------------*/
		// Uncomment and modify the below for a static color
		/*-------------------------------------------------------------*/
		//Color textForestGreen = new Color(92, 150, 113);
		
		
		/*-------------------------------------------------------------*/
		// The below is the starting color of the rgb fade effect
		/*-------------------------------------------------------------*/
		Color RGBinit = new Color(0,255,0);
		
		m.setBrColor(Color.DARK_GRAY);
		txt.setBrColor(Color.DARK_GRAY);
		
		/* Uncomment if you want to add a border between the nunbers */
		/*-------------------------------------------------------------*/
		//Color borderDarkGray = new Color(40, 40, 22);
		//txt.enableBorder(borderDarkGray);
		/*-------------------------------------------------------------*/
		
		txt.setAllStringColor(RGBinit);
		
		txt.setCharacterSize(60);
		
		Time t = new Time();
		
		p.setAllVisible();
		txt.setAllVisible();
		m.setAllVisible();
		
				
		/*-------------------------------------------------------------*/
		// Uncomment below if you want to add a blinking effect to the clock
		/*-------------------------------------------------------------*/
		
		while(true) {
			
			TimeUnit.MILLISECONDS.sleep(10);
			
			txt.setAllStringColor(RGBShift(txt.getCurrentColor().getRed(),txt.getCurrentColor().getGreen(),txt.getCurrentColor().getBlue()));
			//ClockHide(txt);
			ClockUpdate(txt,t);
			//ClockShow(txt);
			
			TimeUnit.MILLISECONDS.sleep(10);

		}
				
	}
	
	public static void ClockUpdate(Myjtextpane m, Time t) {
		String[] data = t.getData();
		m.setString(0, data[0]);
		m.setString(1, data[1]);
		m.setString(2, ":");
		m.setString(3, data[2]);
		m.setString(4, data[3]);
		m.setString(5, ":");
		m.setString(6, data[4]);
		m.setString(7, data[5]);
	}
	
	public static void ClockHide(Myjtextpane m) {
		m.setHidden(0);
		m.setHidden(1);
		m.setHidden(3);
		m.setHidden(4);
		m.setHidden(6);
		m.setHidden(7);
	}
	
	public static void ClockShow(Myjtextpane m) {
		m.setVisible(0);
		m.setVisible(1);
		m.setVisible(3);
		m.setVisible(4);
		m.setVisible(6);
		m.setVisible(7);
	}
	
	public static Color RGBShift(Integer r, Integer g, Integer b) {
		if(r > 0 && b == 0){
			r--;
			g++;
		}
		if(g > 0 && r == 0){
			g--;
			b++;
		}
		if(b > 0 && g == 0){
			r++;
			b--;
		}
		return new Color(r,g,b);
	}

}
