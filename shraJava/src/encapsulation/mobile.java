package encapsulation;

public class mobile {
	private String brand;
	private long price;
	private String color;

	mobile() {
	}

	mobile(String brand, long price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public void detaisofMobile() {
		System.out.println("Brand :" + brand);
		System.out.println("Price :" + price);
		System.out.println("Color :" + color);

	}

	public String getBrand() {
		return brand;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}