package ge.gov.smartlogic.decorator.starbuzz.beverages;

public abstract class Beverage {
	private BeverageSize size = BeverageSize.TALL;
	private String description;

	public Beverage() {
		this.description = "Unknown Beverage";
	}


	protected void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public void setBeverageSize(BeverageSize beverageSize) {
		this.size = beverageSize;
	}
	
	public BeverageSize getSize() {
		return this.size;
	}
 
	public abstract double cost();
}
