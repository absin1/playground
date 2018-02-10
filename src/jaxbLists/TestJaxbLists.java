package jaxbLists;

import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class TestJaxbLists {
	public static void main(String[] args) throws JAXBException {
		Table table = new Table();
		table.setName("Favourite Dishes");
		ArrayList<Cell> cells = new ArrayList<>();
		Cell c1 = new Cell("Palak Paneer",150);
		Cell c2 = new Cell("Chole Bhature",100);
		Cell c3 = new Cell("Chicken Do Pyaaza",200);
		cells.add(c1);
		cells.add(c2);
		cells.add(c3);
		table.setCells(cells);
		JAXBContext.newInstance(Table.class).createMarshaller().marshal(table, System.out);
	}
}
