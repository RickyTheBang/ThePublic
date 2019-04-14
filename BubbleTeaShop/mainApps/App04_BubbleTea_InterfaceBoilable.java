package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;


public class App04_BubbleTea_InterfaceBoilable {
	public static void main(String[] args) {
		BubbleTeaIngredient apple = new Apple();
		BubbleTeaIngredient bubble = new Bubble(Taste.SOURAPPLE);
		BubbleTeaIngredient strawBerry = new StrawBerry();
		BubbleTeaIngredient orange = new Orange();
		
		List<BubbleTeaIngredient> ingredients = new ArrayList<>();
		
		ingredients.add(apple);
		ingredients.add(bubble);
		ingredients.add(strawBerry);
		ingredients.add(orange);
		
		BubbleTea bubbleTea = new BubbleTea(ingredients);
		
		for(BubbleTeaIngredient ingredient: ingredients) {
			System.out.println(ingredient);
		}
		double totalPrice = 0;
		
		for(BubbleTeaIngredient b:  bubbleTea.getIngrediants()) {
			totalPrice += b.getPrice();
		}
		
		System.out.println("\nTotal Price");
		System.out.println(totalPrice);
		
		System.out.println("\nBoiling");
		
		for(BubbleTeaIngredient b:  bubbleTea.getIngrediants()) {
			
			if(b instanceof Boilable) {
				((Boilable) b).boil();
			}
			totalPrice += b.getPrice();
		}
		
		
	}

}
