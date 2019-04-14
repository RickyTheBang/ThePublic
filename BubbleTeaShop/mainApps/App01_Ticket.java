package BubbleTeaShop.mainApps;

import java.util.List;

import BubbleTeaShop.TicketSales.Register;
import BubbleTeaShop.TicketSales.Ticket;

public class App01_Ticket {
	
	public static void main(String[] args) {
		Register register = new Register();

		
		register.addTicket(new Ticket(10));
		register.addTicket(new Ticket(25));
		
		System.out.println(register.getTicketProfit());
		
		
	}

}
