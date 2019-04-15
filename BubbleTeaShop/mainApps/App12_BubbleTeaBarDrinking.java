package BubbleTeaShop.mainApps;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;

public class App12_BubbleTeaBarDrinking {

	public static void main(String[] args) {

		BubbleTeaFactory bar = new BubbleTeaFactory();

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
		});

		BubbleTea bt4 = bar.makeBubbleTea(l4);

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

	}

}
