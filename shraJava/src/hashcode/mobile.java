package hashcode;

import java.util.Objects;

public class mobile {
	String brand;
	double price;
	
	mobile(String brand, double price) {
		this.brand=brand;
		this.price=price;
		
	}
	
	@Override
	public boolean equals(Object o) {
		mobile m=(mobile)o;
		
		if(this.brand.equals(m.brand) && this.price==m.price) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int res=Objects.hash(brand, price);
		return res;
	}
	
}