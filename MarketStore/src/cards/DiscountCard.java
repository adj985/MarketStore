package cards;

public abstract class DiscountCard {
	
	private String owner; 
	private double turnover;
	
	public DiscountCard() {}

	public DiscountCard(String owner, double turnover) {
		this.owner = owner;
		this.turnover = turnover;
	}
	
	public DiscountCard(double turnover) {
		this.turnover = turnover;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	
	public abstract double calculateDiscountRate(double turnover);

	@Override
	public String toString() {
		return "DiscountCard [owner=" + owner + ", turnover=" + turnover + "]";
	}
	
	
	
	
	
	
	
}
