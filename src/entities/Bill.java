package entities;

public class Bill {

	public static final double BEER_VALUE = 5.00;
	public static final double BARBECUE_VALUE = 7.00;
	public static final double SOFT_DRINK_VALUE = 3.00;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		return (beer * BEER_VALUE) + (barbecue * BARBECUE_VALUE) + (softDrink * SOFT_DRINK_VALUE);
	}
	
	public double cover() {
		if (feeding() < 30.00) {
			return 4.00;
		}
		else {
			return 0.00;
		}
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
}
