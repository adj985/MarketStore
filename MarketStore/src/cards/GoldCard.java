package cards;

public class GoldCard extends DiscountCard {

	private final int initialDiscount = 2;

	public GoldCard() {

	}

	public GoldCard(String owner, double turnover) {
		super(owner, turnover);
		
	}
	
	public GoldCard(double turnover) {
		super(turnover);
	}

	public double getInitialDiscount() {
		return initialDiscount;
	}


	@Override
	public double calculateDiscountRate(double turnover) {
		double discountRate = getInitialDiscount();
		
		if (turnover >= 100 && turnover < 200) {
			discountRate += 1;
		} 
		else if (turnover >= 200 && turnover < 300) {
			discountRate += 2;
		} 
		else if (turnover >= 300 && turnover < 400) {
			discountRate += 3;
		} 
		else if (turnover >= 400 && turnover < 500) {
			discountRate += 4;
		} 
		else if (turnover >= 500 && turnover < 600) {
			discountRate += 5;
		}
		else if (turnover >= 600 && turnover < 700) {
			discountRate += 6;
		} 
		else if (turnover >= 700 && turnover < 800) {
			discountRate += 7;
		} 
		else if (turnover >= 800) {
			discountRate += 8;
		}
		
		
		return discountRate;
	}

	@Override
	public String toString() {
		return "GoldCard \n initialDiscount: " + getInitialDiscount() +  "%\n owner: " + getOwner() + "\n turnover= "
				+ getTurnover() + "\n discount rate: " + calculateDiscountRate(getTurnover()) + "%";
	}

	
	
	
	
	
}
