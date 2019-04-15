package BubbleTeaShop.TicketSales;


import java.time.LocalDateTime;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.BubbleTeaIngredient;

public class Ticket {
	private LocalDateTime ticketTime= LocalDateTime.now().plusSeconds(getTicketNo()*50);
	
	private static int ticketNo = 0;
	private double price=0;
	private double profit=0;
	private Order order;

	{
		ticketNo++;
	}

	public Ticket() {

	}

	public Ticket(double price) {

		this.price = price;
	}

	public Ticket(Order order) {

		this.order = order;
	}

	public static int getTicketNo() {
		return ticketNo;
	}

	public static void setTicketNo(int ticketNo) {
		Ticket.ticketNo = ticketNo;
	}

	private double calPrice() {
		
		profit=0;
		List<BubbleTeaIngredient> bubbleTeaIngredients = getOrder().getIngredients();
		

		for (BubbleTeaIngredient b : bubbleTeaIngredients) {
			profit += b.getPrice();
			
		}
	
		return profit;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public LocalDateTime getTicketTime() {
		return ticketTime;
	}

	public void setTicketTime(LocalDateTime ticketTime) {
		this.ticketTime =ticketTime.plusSeconds(getTicketNo()*50);
		
		
	}

	public double getPrice() {
		return price;
	}

	public double getProfit() {
		return calPrice();
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [ticketTime=" + ticketTime +  ", profit=" + getProfit() + ", order=" + order
				+ "]";
	}
	

	
	
	
	

}
