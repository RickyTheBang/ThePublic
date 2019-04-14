package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;

public class App08_OrderHandler_ArrayList {

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
		
		for(BubbleTeaIngredient ingredient: bubbleTea.getIngrediants()) {
			System.out.println(ingredient);
		}
		
		double totalPrice = 0;
		
		for(BubbleTeaIngredient b:  bubbleTea.getIngrediants()) {
			totalPrice += b.getPrice();
		}
		
		System.out.println("Total Price");
		System.out.println(totalPrice);
		
//		for(BubbleTeaIngredient b:  bubbleTea.getIngrediants()) {
//			
//			if(b instanceof Boilable) {
//				((Boilable) b).boil();
//			}
//			totalPrice += b.getPrice();
//		}
//		
//		bubbleTea.drink();
	}

}
