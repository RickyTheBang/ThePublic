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

	public void setIngrediants(List<BubbleTeaIngredient> ingrediants) {
		this.ingrediants = ingrediants;
	}

	public void drink() {
		System.out.println("You are drinking a tea with: ");
		for (BubbleTeaIngredient ing : getIngrediants()) {
			System.out.println(ing.getClass().getSimpleName());
		}
	}

	@Override
	public String toString() {
		
		
		
		return "BubbleTea, whith the following ingrediants= " + ingrediants  ;
	}
	
	

}
