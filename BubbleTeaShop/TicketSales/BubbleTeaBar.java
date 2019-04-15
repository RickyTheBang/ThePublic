package BubbleTeaShop.TicketSales;

import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;


public class BubbleTeaBar {
	private BubbleTeaFactory factory = new BubbleTeaFactory();
	private Register register = factory.getRegister();
	private Stock stock = factory.getStock();
	
	private boolean flagF1 = true;
	private boolean flagF2 = true;
	private boolean flagF3 = true;

	public BubbleTeaBar() {

	}

	public BubbleTea  acceptTicket(Ticket ticketIn) {
	
		BubbleTea output = new BubbleTea(ticketIn.getOrder().getIngredients());
		
		try {factory.stockEmpty(ticketIn.getOrder().getIngredients());
			
			
			register.addTicket(ticketIn);

		} catch (BubbleIngredientShortage e) {
			// TODO Auto-generated catch block
			if(flagF1){
				System.out.println(e.getMessage());
				
				flagF1 = false;
			}
			output = null;
			
		}
		
		flagF1 = true;
		return output;
	
	}

	public BubbleTea makeBubbleTea(List<BubbleTeaIngredient> order) {
		return factory.makeBubbleTea(order);
		
	}
	
	public BubbleTea makeBubbleTea( MenuCard menu) {
		return factory.makeBubbleTea(menu);
	}

	public BubbleTea makeBubbleTea(Order order) {
		BubbleTea output = new BubbleTea(order.getIngredients());
		try {
			factory.stockEmpty(order.getIngredients());
			Ticket t = new Ticket(order);
			register.addTicket(t);
		}catch (BubbleIngredientShortage e) {
			// TODO Auto-generated catch block
			if(flagF2){
				System.out.println(e.getMessage());
				
				flagF2 = false;
			}
			flagF2 = true;
			output = null;
			
		}
		
		
		return output;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
