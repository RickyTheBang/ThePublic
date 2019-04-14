package BubbleTeaShop.mainApps;

import BubbleTeaShop.TicketSales.*;


public class App05_BubbleTeaBar {
	
	public static void main(String[] args) {
		BubbleTeaBar bubbleTeaBar = new BubbleTeaBar();
		bubbleTeaBar.acceptTicket(new Ticket(4.2));
		bubbleTeaBar.acceptTicket(new Ticket(4.2));
		bubbleTeaBar.acceptTicket(new Ticket(4.2));
		bubbleTeaBar.acceptTicket(new Ticket(4.2));
		bubbleTeaBar.acceptTicket(new Ticket(4.2));
		
		double profit =  bubbleTeaBar.getRegister().getTicketProfit();
		System.out.println("PROFIT");
		System.out.println(profit);
			
		}
		
	}


