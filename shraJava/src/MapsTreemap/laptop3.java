package MapsTreemap;

public class laptop3 implements Comparable<Object>{
	String brand;
	double price;

	public laptop3(String brand, double price) {
		this.brand = brand;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Brand: " + brand + " Price: " + price;
	}
	@Override
	public int compareTo(Object o) {
		laptop3 l=(laptop3) o;
		int res= (int) (this.price-l.price);
		return res;
	}
}
