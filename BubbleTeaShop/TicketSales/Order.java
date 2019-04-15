package BubbleTeaShop.TicketSales;

import java.util.ArrayList;
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
	
	private  static List<BubbleTeaIngredient> listCreamy = new ArrayList<BubbleTeaIngredient>();
	static
	{
		listCreamy.add(new Apple());
		listCreamy.add(new Bubble(Taste.SWEETAPPLE));
		listCreamy.add(new Cream());
	}
	
	public static Order creamy = new Order(listCreamy);
	
	
	private  static List<BubbleTeaIngredient> listRed = new ArrayList<BubbleTeaIngredient>();
	static
	{
		listRed.add(new StrawBerry());
		listRed.add(new Bubble(Taste.STRAWBERRY));
		
	}
	
	public static Order red = new Order(listRed);
	
	
	private  static List<BubbleTeaIngredient> listGinger = new ArrayList<BubbleTeaIngredient>();
	static
	{
		listGinger.add(new Ginger());
		listGinger.add(new Bubble(Taste.LIME));
		
	}
	
	public static Order ginger = new Order(listGinger);
	

}
