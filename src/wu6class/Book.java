package wu6class;

import jdk.nashorn.internal.runtime.linker.PrimitiveLookup;

public class Book implements Comparable<Book> {

	private String id;
	private String name;
	private double price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (o.getPrice() > this.price) {
			return 1;
		} else if (o.getPrice() < this.price) {
			return -1;
		} else {
			return 0;
		}
	}

}