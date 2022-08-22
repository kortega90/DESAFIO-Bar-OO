package entities;

public class Bill {

public char gender;
public int beer;
public int barbecue;
public int softDrink;

public static final int beerValeu = 5;
public static final int barbecueValeu = 7;
public static final int softDrinkValeu = 3;

public double cover() {
	 return (beer*beerValeu)+(barbecue*barbecueValeu) + (softDrink*softDrinkValeu);
	 
	 
}
}
