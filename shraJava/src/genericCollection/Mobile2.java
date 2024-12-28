package genericCollection;

public class Mobile2 implements Comparable<Object> {
	String brand;

	Mobile2(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Brand: " + brand;
	}

	//override same like equals methid but comapreTo return type is int
	@Override
	public int compareTo(Object o) {
		Mobile2 m = (Mobile2) o;
		int res = this.brand.compareTo(m.brand);
		return res;
	}
}
