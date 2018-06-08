package anabeast.jebelaw.models;

import org.springframework.data.annotation.Id;

public class Product {
	@Id
	public String Id;
	public String name;
	public String description;
	
	public Product() {	
	}
	
	public String toString() {
		return this.name;
	}
	
	
	
}
