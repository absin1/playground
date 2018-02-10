package jaxbLists;

public class Cell {
	String name;
	Integer price;

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Cell(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Cell() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}
}
