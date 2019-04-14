package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;


public class App02_BubbleTea {
	public static void main(String[] args) {
		BubbleTeaIngredient strawBerry = new StrawBerry(0.5);
		BubbleTeaIngredient cinamon = new Cinamon(0.75);
		BubbleTeaIngredient limeBubble = new Bubble(0.5,Taste.LIME);
		
		List<BubbleTeaIngredient> ingredients =new ArrayList<>();
		ingredients.add(strawBerry);
		ingredients.add(cinamon);
		ingredients.add(limeBubble);
		
		
		
		for(BubbleTeaIngredient ingredient : ingredients ) {
			System.out.println(ingredient);
		}
			
		
		
		
	}


}
