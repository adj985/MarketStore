package cards;

public class BronzeCard extends DiscountCard {

	private final int initialDiscount = 0;
	
	public BronzeCard() {

	}

	public BronzeCard(String owner, double turnover) {
		super(owner, turnover);
	}
	
	public BronzeCard(double turnover) {
		super(turnover);
	}
	

	public int getInitialDiscount() {
		return initialDiscount;
	}

	
	@Override
	public double calculateDiscountRate(double turnover) {
		double discountRate = getInitialDiscount();
		
		if (turnover >= 100 && turnover <= 300) {
			discountRate = 1;
		} else if(turnover > 300) {
			discountRate = 2.5;
		}
		
		
		return discountRate;
	}

}
