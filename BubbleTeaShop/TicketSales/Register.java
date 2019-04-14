package BubbleTeaShop.TicketSales;

import java.util.ArrayList;
import java.util.List;

public class Register {
	private double profit=0;
	
	private List<Ticket> tickets = new ArrayList<>();

	public Register() {
		
	}

	
	public double getTicketProfit() {
		 profit=0;
		for(int i = 0;i<tickets.size();i++) {
			profit +=  tickets.get(i).getPrice();
		}
		
		return profit;
	}
	public double getProfit() {

		for(int i = 0;i<tickets.size();i++) {
			profit +=  tickets.get(i).getProfit();
		}
		
		return profit;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public void addTicket(Ticket ticketIn) {
		tickets.add(ticketIn);
	}
	
	
	
	

}
