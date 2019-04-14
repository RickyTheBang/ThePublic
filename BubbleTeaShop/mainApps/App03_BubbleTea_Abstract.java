package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;


public class App03_BubbleTea_Abstract {
	public static void main(String[] args) {
		BubbleTeaIngredient apple = new Apple();
		BubbleTeaIngredient bubble = new Bubble(Taste.SOURAPPLE);
		BubbleTeaIngredient strawBerry = new StrawBerry(1
				);
		BubbleTeaIngredient orange = new Orange();
		orange.setPrice(0.75);
		
		List<BubbleTeaIngredient> ingredients = new ArrayList<>();
		
		ingredients.add(apple);
		ingredients.add(bubble);
		ingredients.add(strawBerry);
		ingredients.add(orange);
		
		for(BubbleTeaIngredient ingredient: ingredients) {
			System.out.println(ingredient);
		}
		
		
		
		
	}

}
