package BubbleTeaShop.TicketSales;

import java.util.List;

import BubbleTeaShop.BubbleTeaParts.Boilable;
import BubbleTeaShop.BubbleTeaParts.BubbleTea;
import BubbleTeaShop.BubbleTeaParts.BubbleTeaIngredient;

public class BubbleTeaBar {
	
	private Register register = new Register();
	private Stock stock = new Stock(2,2,2,2,2,5,5);

	public BubbleTeaBar() {
	
	}
	
	public void acceptTicket(Ticket ticketIn) {
		register.addTicket(ticketIn);
	}
	
	public BubbleTea makeBubbleTea(List<BubbleTeaIngredient> order) {
		
		
		BubbleTea output = new BubbleTea(order);
		Order o = new Order(order);
		Ticket t = new Ticket(o);
		register.addTicket(t);
		return output;
	}
	
	public BubbleTea makeBubbleTea(Order order) {
		BubbleTea output =new BubbleTea(order.getIngredients());
		
		Ticket t = new Ticket(order);
		register.addTicket(t);
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
