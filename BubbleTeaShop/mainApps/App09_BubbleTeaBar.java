package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.Apple;
import BubbleTeaShop.BubbleTeaParts.Bubble;
import BubbleTeaShop.BubbleTeaParts.BubbleTea;
import BubbleTeaShop.BubbleTeaParts.BubbleTeaIngredient;
import BubbleTeaShop.BubbleTeaParts.Cream;
import BubbleTeaShop.BubbleTeaParts.Ginger;
import BubbleTeaShop.BubbleTeaParts.Orange;
import BubbleTeaShop.BubbleTeaParts.StrawBerry;
import BubbleTeaShop.BubbleTeaParts.Taste;
import BubbleTeaShop.TicketSales.BubbleTeaBar;
import BubbleTeaShop.TicketSales.Order;
import BubbleTeaShop.TicketSales.Ticket;

public class App09_BubbleTeaBar {

	public static void main(String[] args) {

		BubbleTeaBar bar = new BubbleTeaBar();

		// Order 1
		BubbleTeaIngredient orange = new Orange();
		BubbleTeaIngredient bubbleLime = new Bubble(Taste.LIME);

		List<BubbleTeaIngredient> listO1 = new ArrayList<>();
		listO1.add(orange);
		listO1.add(bubbleLime);

		Order order1 = new Order(listO1);
		Ticket t1 = new Ticket(order1);

		// Order 2
		BubbleTeaIngredient gingerTea = new Ginger();
		BubbleTeaIngredient strawberry1 = new StrawBerry();
		BubbleTeaIngredient cream = new Cream();
		List<BubbleTeaIngredient> listO2 = new ArrayList<>();
		listO2.add(gingerTea);
		listO2.add(strawberry1);
		listO2.add(cream);
		
		// Order 3
		BubbleTeaIngredient strawberry2 = new StrawBerry();
		BubbleTeaIngredient bubbleStrawberry = new Bubble(Taste.STRAWBERRY);
		List<BubbleTeaIngredient> listO3 = new ArrayList<>();
		listO3.add(strawberry2);
		listO3.add(bubbleStrawberry);
		Order order3 = new Order(listO3);

		BubbleTea bt1 = bar.makeBubbleTea(t1.getOrder());
		BubbleTea bt2 = bar.makeBubbleTea(listO2);
		BubbleTea bt3 = bar.makeBubbleTea(order3);

		List<BubbleTea> teaFactory = new ArrayList<>();

		teaFactory.add(bt1);
		teaFactory.add(bt2);
		teaFactory.add(bt3);

		for (BubbleTea bt : teaFactory) {

			System.out.println(bt);
		}

		System.out.println("Profit");
		System.out.println(bar.getRegister().getProfit());

	}

}
