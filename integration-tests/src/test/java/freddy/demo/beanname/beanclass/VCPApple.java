package freddy.demo.beanname.beanclass;

import org.springframework.stereotype.Component;

@Component
public class VCPApple {

	private String name = "VCPApple";

	public VCPApple() {
	}

	public VCPApple(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "VCPApple{" +
				"name='" + name + '\'' +
				'}';
	}
}
