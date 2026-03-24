package inheritance;

public final class Vehicle {
	
	private String color;
	protected int maxSpeed;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.print("Vehicle color " +getColor()+ ", maxSpeed " +maxSpeed);
	}

}
