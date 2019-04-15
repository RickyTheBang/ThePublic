package BubbleTeaShop.TicketSales;

import java.util.ArrayList;
import java.util.List;

import BubbleTeaShop.BubbleTeaParts.*;
import BubbleTeaShop.TicketSales.*;

public enum MenuCard {

	CREAMYGREEN(Order.creamy), REDDREAM(Order.red),GINGERSPICE(Order.ginger);

	private Order order;

	MenuCard(Order order) {
		this.order = order;

	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}