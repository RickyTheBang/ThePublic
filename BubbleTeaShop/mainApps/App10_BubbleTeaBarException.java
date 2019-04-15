package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;


public class App10_BubbleTeaBarException {

	public static void main(String[] args) {

		BubbleTeaBar bar = new BubbleTeaBar();

		// Order 1
		BubbleTeaIngredient orange = new Orange();
		BubbleTeaIngredient bubbleLime = new Bubble(Taste.LIME);
		BubbleTeaIngredient apple1 =  new Apple();
		BubbleTeaIngredient apple2 = new Apple();
		BubbleTeaIngredient apple3 =new Apple();
		BubbleTeaIngredient ing1 =new Apple();
		BubbleTeaIngredient ing2 =new Bubble();		
		BubbleTeaIngredient ing3 =new Cinamon();		
		BubbleTeaIngredient ing4 =new Cream();		
		BubbleTeaIngredient ing5 =new Ginger();		
		BubbleTeaIngredient ing6 =new Orange();		
		BubbleTeaIngredient ing7 =new StrawBerry();		
			
		

		List<BubbleTeaIngredient> listO1 = new ArrayList<>();
		
		
		listO1.add(ing1);
		listO1.add(ing2);
		listO1.add(ing3);
		listO1.add(ing4);
		listO1.add(ing5);
		listO1.add(ing6);
		listO1.add(ing7);
		

		listO1.add(ing1);
		listO1.add(ing2);
		listO1.add(ing3);
		listO1.add(ing4);
		listO1.add(ing5);
		listO1.add(ing6);
		listO1.add(ing7);
		
		//listO1.add(ing7);
		
		
		
		
		
		
		
		
		
		
		
//		listO1.add(orange);
//		listO1.add(bubbleLime);
//		listO1.add(apple1);
//		listO1.add(apple2);
//		listO1.add(apple3);

		Order order1 = new Order(listO1);
		//Ticket t1 = new Ticket(order1);

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

		//bar.acceptTicket(t1);
		BubbleTea bt1 = bar.makeBubbleTea(listO1);
//		BubbleTea bt2 = bar.makeBubbleTea(listO2);
//		BubbleTea bt3 = bar.makeBubbleTea(order3);
		
		List<BubbleTea> teaFactory = new ArrayList<>();

		teaFactory.add(bt1);
//		teaFactory.add(bt2);		
//		teaFactory.add(bt3);

		for (BubbleTea bt : teaFactory) {

			System.out.println(bt);
		}

		System.out.println("Profit");
		System.out.println(bar.getRegister().getProfit());

	}

}
