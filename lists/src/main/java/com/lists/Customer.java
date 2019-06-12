package com.lists;

import java.util.Arrays;

public class Customer {

	public static String[] chooseMeal(String meal){
		
		String[] chosenMeal = null;
		
		switch (meal.toLowerCase()){
		case "spaghetti":
			chosenMeal = new String[] {"Noodles", "Sauce", "Garlic Bread"};
			break;
		case "chili":
			chosenMeal = new String[] {"Hamburger Meat", "Chili Seasoning", "Tomatoes", "Chili Beans"};
			break;
		case "hamburgers":
			chosenMeal = new String[] {"Hamburger Buns", "Cheese", "Hamburger Meat", "Ketchup"};
			break;
		case "bbq chicken":
			chosenMeal = new String[] {"BBQ Sauce", "Chicken"};
			break;
		case "tacos":
			chosenMeal = new String[] {"Taco Shells", "Hamburger Meat", "Shredded Cheese", "Salsa"};
			break;
		default:
			System.out.println("INVALID MEAL, LIST WILL NOT REFLECT " + meal + ".");
			break;
		}
		
		return chosenMeal;
	}

}