package freddy.demo.beanname.beanmethod;

public class Apple {

	private String name = "Apple";

	public Apple() {
	}

	public Apple(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Apple{" +
				"name='" + name + '\'' +
				'}';
	}
}
