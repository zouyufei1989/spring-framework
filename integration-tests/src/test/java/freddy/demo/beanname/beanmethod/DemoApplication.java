package freddy.demo.beanname.beanmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//$$2.
public class DemoApplication {

	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("freddy.demo.beanname.beanmethod");

			for (String beanName : context.getBeanDefinitionNames()) {
				System.out.printf("%s: %s%n", beanName, context.getBean(beanName));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
