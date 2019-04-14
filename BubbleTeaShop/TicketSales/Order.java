package BubbleTeaShop.TicketSales;

import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;

public class Order {
	private static int counter;
	private  int orderNo;
	private List<BubbleTeaIngredient> ingredients;
	static {
		counter = 0;
	}
	{
		counter++;
		orderNo = counter;
	}
	

	public  int getOrderNo() {
		return orderNo;
	}

	public Order() {

	}

	public Order(List<BubbleTeaIngredient> ingredients) {

		this.ingredients = ingredients;
	}

//	public void setOrderNo(int orderNo) {
//		this.orderNo = orderNo;
//	}

	public List<BubbleTeaIngredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<BubbleTeaIngredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "OrderNo=" + getOrderNo() + ": " + ingredients;
	}

}
