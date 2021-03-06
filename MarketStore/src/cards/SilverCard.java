package cards;

public class SilverCard extends DiscountCard {

	private final int initialDiscount = 2;

	public SilverCard() {
		// TODO Auto-generated constructor stub
	}

	public SilverCard(String owner, double turnover) {
		super(owner, turnover);
		// TODO Auto-generated constructor stub
	}
	
	public SilverCard(double turnover) {
		super(turnover);
	}

	public int getInitialDiscount() {
		return initialDiscount;
	}

	@Override
	public double calculateDiscountRate(double turnover) {
		double discountRate = getInitialDiscount();
		
		if (turnover > 300) {
			discountRate = discountRate + 1.5;
			return discountRate;
		} 
		
		return discountRate;
	}

}
