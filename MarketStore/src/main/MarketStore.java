package main;

import cards.DiscountCard;

public class MarketStore {

	private double purchaseValue;
	private DiscountCard discountCard;
	private double turnover;
	
	public MarketStore() {
		
	}

	public MarketStore(double purchaseValue, DiscountCard discountCard, double turnover) {
		this.purchaseValue = purchaseValue;
		this.discountCard = discountCard;
		this.turnover = turnover;
	}

	public double getPurchaseValue() {
		return purchaseValue;
	}

	public void setPurchaseValue(double purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	public DiscountCard getDiscountCard() {
		return discountCard;
	}

	public void setDiscountCard(DiscountCard discountCard) {
		this.discountCard = discountCard;
	}
	
	public double getDiscount() {
		return purchaseValue * discountCard.calculateDiscountRate(turnover)/100;
	}

	@Override
	public String toString() {
		return "PurchaseValue: $" + purchaseValue + "\nDiscount rate: " + discountCard.calculateDiscountRate(turnover) + "%\nDiscount: $" + getDiscount() + "\nTotal: " + (purchaseValue - getDiscount());
	}

}
