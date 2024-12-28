package genericCollection;

public class Mobile {
	String brand;

	Mobile(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Brand: " + brand;
	}
}
