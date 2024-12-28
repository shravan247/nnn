package toString;
public class laptop {
	String brand;
	double price;
	
	laptop() {
		//super();
	}
	laptop(String brand, double price ){
		
		this.brand=brand;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "Brand: "+brand + " Price:" +price;
		
	}
}