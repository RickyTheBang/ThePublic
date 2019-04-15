package BubbleTeaShop.TicketSales;

import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;


public class BubbleTeaFactory {

	private Register register = new Register();
	private Stock stock = new Stock(2, 2, 2, 2, 2, 5,5);
	private boolean flagF1 = true;
	private boolean flagF2 = true;
	private boolean flagF3 = true;

	public BubbleTeaFactory() {

	}

	

	public BubbleTea makeBubbleTea(List<BubbleTeaIngredient> order) {
		BubbleTea output = new BubbleTea(order);

		try {
			stockEmpty(order);
			Order o = new Order(order);
			Ticket t = new Ticket(o);
			register.addTicket(t);

		} catch (BubbleIngredientShortage e) {
			// TODO Auto-generated catch block
			if(flagF1){
				System.out.println(e.getMessage());
				
				flagF1 = false;
			}
			output = null;
			
		}
		flagF1 = true;
		return output;

	}

	public BubbleTea makeBubbleTea( MenuCard menu) {
		BubbleTea output = new BubbleTea(menu.getOrder().getIngredients());
		try {
			stockEmpty(menu.getOrder().getIngredients());
			Ticket t = new Ticket(menu.getOrder());
			register.addTicket(t);
		}catch (BubbleIngredientShortage e) {
			// TODO Auto-generated catch block
			if(flagF2){
				System.out.println(e.getMessage());
				
				flagF2 = false;
			}
			flagF2 = true;
			output = null;
			
		}
		
		
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

	private void stockEmpty(List<BubbleTeaIngredient> ingrediants) throws BubbleIngredientShortage {

		for (BubbleTeaIngredient ingr : ingrediants) {

			String ingredient = ingr.getClass().getSimpleName().toString();

			switch (ingredient) {
			case "Apple":
				if (stock.getAppleAmount() <= 0) {
					throw new BubbleIngredientShortage("No more Apple");
				} else {
					stock.setAppleAmount(stock.getAppleAmount() - 1);
				}
				break;
				
			case "Bubble":
				if (stock.getBubbleAmount() <= 0) {
					throw new BubbleIngredientShortage("No more Bubble");
				} else {
					stock.setBubbleAmount(stock.getBubbleAmount() - 1);
				}
				break;
				
				
			case "Cinamon":
				if (stock.getCinamonAmount() <= 0) {
					throw new BubbleIngredientShortage("No more Cinamon");
				} else {
					stock.setCinamonAmount(stock.getCinamonAmount() - 1);
				}
				break;
				
			case "Cream":
				if (stock.getCreamAmount() <= 0) {
					throw new BubbleIngredientShortage("No more Cream");
				} else {
					stock.setCreamAmount(stock.getCreamAmount() - 1);
				}
				break;
				
			case "Ginger":
				if (stock.getGingerAmount() <= 0) {
					throw new BubbleIngredientShortage("No more Ginger");
				} else {
					stock.setGingerAmount(stock.getGingerAmount() - 1);
				}
				break;
				
			case "Orange":
				if (stock.getOrangeAmount() <= 0) {
					throw new BubbleIngredientShortage("No more Orange");
				} else {
					stock.setOrangeAmount(stock.getOrangeAmount() - 1);
				}
				break;
				
			case "StrawBerry":
				if (stock.getStrawberryAmount() <= 0) {
					throw new BubbleIngredientShortage("No more StrawBerry");
				} else {
					stock.setStrawberryAmount(stock.getStrawberryAmount() - 1);
				}
				break;
				
			

			}

		}

	}

}
