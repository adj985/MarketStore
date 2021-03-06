package main;

import cards.BronzeCard;
import cards.GoldCard;
import cards.SilverCard;

public class Main {

	public static void main(String[] args) {
		
		double bronzeTurnover = 0;
		double bronzePurchaseValue = 150;
		
		double silverTurnover = 600;
		double silverPurchaseValue = 850;
		
		double goldTurnover = 800;
		double goldPurchaseValue = 1000;
		
		
		MarketStore msBronze = new MarketStore(bronzePurchaseValue, new BronzeCard(bronzeTurnover), bronzeTurnover);
		MarketStore msSilver = new MarketStore(silverPurchaseValue, new SilverCard(silverTurnover), silverTurnover);
		MarketStore msGold = new MarketStore(goldPurchaseValue, new GoldCard(goldTurnover), goldTurnover);
		
		
		System.out.println(msBronze + "\n");
		System.out.println(msSilver + "\n");
		System.out.println(msGold + "\n");

	}

}
