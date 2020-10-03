package testPrivate;

public class Phone {

	private String logo="ÈýÐÇ";
	private double price=3999;
	private String color="°×É«";
	public String location="º«¹ú";
	
	
	double width=3;
	protected double length=12;
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public Phone setColor(String color) {
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	
	
    public Phone(String logo, double price, String color, String location, double width, double length) {
		super();
		this.logo = logo;
		this.price = price;
		this.color = color;
		this.location = location;
		this.width = width;
		this.length = length;
	}
    
	public Phone() {
		super();
	}
	@Override
	public String toString() {
		return "Phone [logo=" + logo + ", price=" + price + ", color=" + color + ", location=" + location + ", width="
				+ width + ", length=" + length + "]";
	}
	public static void main(String[] args) {
    	Phone p = new Phone();
    	System.out.println(p.color);
	
}
}
