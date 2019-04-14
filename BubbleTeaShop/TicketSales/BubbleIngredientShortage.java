package BubbleTeaShop.TicketSales;

public class BubbleIngredientShortage extends Exception {

	
	private static final long serialVersionUID = 4794227585131382496L;
	
	
	BubbleIngredientShortage(){
		super();
	}
	
	BubbleIngredientShortage(String message){
		super(message);
	}
	

}
