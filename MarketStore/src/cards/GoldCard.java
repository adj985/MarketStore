package cards;

public class GoldCard extends DiscountCard {

	private final int initialDiscount = 2;

	public GoldCard() {

	}

	public GoldCard(String owner, int turnover) {
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
		int discountRate = (int) Math.min(10, turnover/100 + 2);
		return discountRate;
	}

	@Override
	public String toString() {
		return "GoldCard \n initialDiscount: " + getInitialDiscount() +  "%\n owner: " + getOwner() + "\n turnover= " + getTurnover() + "\n discount rate: " + calculateDiscountRate(getTurnover()) + "%";
	}

	
	
	
	
	
}
