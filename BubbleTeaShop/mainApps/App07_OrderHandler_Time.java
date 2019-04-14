package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;

public class App07_OrderHandler_Time {

	public static void main(String[] args) {
		BubbleTeaBar bar = new BubbleTeaBar();
		// Order 1
		BubbleTeaIngredient appleTea = new Apple();
		BubbleTeaIngredient bubbleStraw = new Bubble(Taste.STRAWBERRY);
		List<BubbleTeaIngredient> listO1 = new ArrayList<>();
		listO1.add(appleTea);
		listO1.add(bubbleStraw);
		Order order1 = new Order(listO1);
		Ticket t1 = new Ticket(order1);
		// Order 2
		BubbleTeaIngredient cinamon = new StrawBerry();
		BubbleTeaIngredient bubbleSweet = new Bubble(Taste.SWEETAPPLE);
		BubbleTeaIngredient cream = new Cream();
		List<BubbleTeaIngredient> listO2 = new ArrayList<>();
		listO2.add(cinamon);
		listO2.add(bubbleSweet);
		listO2.add(cream);
		Order order2 = new Order(listO2);

		Ticket t2 = new Ticket(order2);
		// Order 3
		BubbleTeaIngredient gingerTea = new Ginger();
		BubbleTeaIngredient bubbleLime = new Bubble(Taste.LIME);
		List<BubbleTeaIngredient> listO3 = new ArrayList<>();
		listO3.add(gingerTea);
		listO3.add(bubbleLime);
		Order order3 = new Order(listO3);
		Ticket t3 = new Ticket(order3);
		bar.acceptTicket(t1);
		bar.acceptTicket(t2);
		bar.acceptTicket(t3);

		System.out.println("Profit");
		System.out.println(bar.getRegister().getProfit());
		for (Ticket t : bar.getRegister().getTickets()) {
			System.out.println(t.getTicketTime());
			for(BubbleTeaIngredient bt :t.getOrder().getIngredients()) {
				System.out.println(bt);
			}
		}
		
		

	}

}
