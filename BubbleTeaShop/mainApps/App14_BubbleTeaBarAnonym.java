package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;

public class App14_BubbleTeaBarAnonym {

	public static void main(String[] args) {

		BubbleTeaBar bar = new BubbleTeaBar();

		BubbleTea bt1 = bar.makeBubbleTea(MenuCard.CREAMYGREEN);
		BubbleTea bt2 = bar.makeBubbleTea(MenuCard.REDDREAM);
		BubbleTea bt3 = bar.makeBubbleTea(MenuCard.GINGERSPICE);

		BubbleTeaIngredient orange = new Orange();
		List<BubbleTeaIngredient> l4 = new ArrayList<BubbleTeaIngredient>();
		l4.add(orange);
		l4.add(new BubbleTeaIngredient() {
			double price = 25;
		

			@Override
			public double getPrice() {
				return this.price;
			}

			@Override
			public void setPrice(double price) {
				this.price = price;
			}
			@Override
			public void setName(String name) {
				
				
			}

			@Override
			public String getName() {
				
				return "Passion Fruit";
			}
		});

		;
		Order order1 = new Order(l4);
		Ticket ticket1 = new Ticket(order1);
		BubbleTea bt4 = bar.acceptTicket(ticket1);
		

		List<BubbleTea> teaFactory = new ArrayList<>();

		teaFactory.add(bt1);
		teaFactory.add(bt2);
		teaFactory.add(bt3);
		teaFactory.add(bt4);

		for (BubbleTea bt : teaFactory) {
			bt.drink();

			
		}

		System.out.println("Profit");
		System.out.println(bar.getRegister().getProfit());
		System.out.println("Number of ticket");
		System.out.println(Ticket.getTicketNo());

	}

}
