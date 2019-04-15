package BubbleTeaShop.TicketSales;

public class BubbleIngredientShortage extends Exception {

	
	private static final long serialVersionUID = 4794227585131382496L;
	
	
	public BubbleIngredientShortage(){
		super();
	}
	
	public BubbleIngredientShortage(String message){
		super(message);
	}
	

}
