package MapsTreemap;

public class laptop {

	String brand;
	String color;

	public laptop(String brand, String color) {
		this.brand = brand;
		this.color = color;

	}

	@Override
	public String toString() {
		return "Brand: " + brand + " color: " + color;
	}
}
