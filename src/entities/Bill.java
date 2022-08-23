package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public static final int coverValeu = 30;
	public static final int beerValeu = 5;
	public static final int barbecueValeu = 7;
	public static final int softDrinkValeu = 3;

	public double feeding() {
		return (beer * beerValeu) + (barbecue * barbecueValeu) + (softDrink * softDrinkValeu);

	}

	public double cover() {

		if (feeding() <= coverValeu) {

			return 4.00;

		} else {
			return 0.0;
		}
	}

	public double ticket() {

		if (gender == 'M') {

			return 10.00;
		} else {

			return 8.00;
		}

	}
	
	public double total() {
		return feeding() +cover() + ticket();
		}
	
	
}
