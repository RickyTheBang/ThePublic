package BubbleTeaShop.BubbleTeaParts;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.TicketSales.BubbleIngredientShortage;

public class BubbleTea {
	private List<BubbleTeaIngredient> ingrediants = new ArrayList<>();

	public BubbleTea() {

	}

	public BubbleTea(List<BubbleTeaIngredient> ingrediants)  {
		
		
		
			setIngrediants(ingrediants);
		
	}

	public List<BubbleTeaIngredient> getIngrediants() {
		return ingrediants;
	}

	public void setIngrediants(List<BubbleTeaIngredient> ingrediants)  {
		this.ingrediants = ingrediants;
	}

	public void drink() {
		System.out.println("You are drinking a tea with: ");
		double total = 0;
		for (BubbleTeaIngredient ing : getIngrediants()) {
			total += ing.getPrice();
			System.out.println(ing.getClass().getSimpleName() + ": "+ing.getPrice());
		}
		System.out.println("The total price is " + total +"\n");
	}

	@Override
	public String toString() {
		
	
		
		
		
		return "BubbleTea, whith the following ingrediants= " + ingrediants  ;
	}
	
	
	
	

}
