package freddy.demo.beanname.beanclass;

import org.springframework.stereotype.Component;

@Component
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
