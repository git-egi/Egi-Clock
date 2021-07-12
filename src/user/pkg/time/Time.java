package user.pkg.time;

public class Time {
	String hr0;
	String hr1;
	String min0;
	String min1;
	String sec0;
	String sec1;
	
	
	public Time() {
		this.hr0 = "0";
		this.hr1 = "0";
		this.min0 = "0";
		this.min1 = "0";
		this.sec0 = "0";
		this.sec1 = "0";
	}
	
	public String getCurrentTime() {
		return java.time.LocalTime.now().toString();
	}
	
	public void update() {
		String time = getCurrentTime();
		String[] splitted = time.split(":");
		
		this.hr0 = String.valueOf(splitted[0].charAt(0));
		this.hr1 = String.valueOf(splitted[0].charAt(1));
		
		this.min0 = String.valueOf(splitted[1].charAt(0));
		this.min1 = String.valueOf(splitted[1].charAt(1));
		
		this.sec0 = String.valueOf(splitted[2].charAt(0));
		this.sec1 = String.valueOf(splitted[2].charAt(1));	
	}
	
	public void sethr0(String inp) {
		this.hr0 = inp;
	}
	
	public String[] getData() {
		update();
		String[] t = {this.hr0,this.hr1,this.min0,this.min1,this.sec0,this.sec1};
		return t;
	}
}
