import java.util.Comparator;

class Developer {
	String name;
	Comparator<Developer> byName = (Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName());

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Developer d1 = new Developer("Abhinav");
		Developer d2 = new Developer("Singh");
	}
}
