package freddy.demo.beanname.beanmethod;

import freddy.demo.beanDefinitionOverride._01_reproduce.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {

	@Bean
	public Apple getApple1() {
		return new Apple("getApple1");
	}

	@Bean
	public Apple GetApple2() {
		return new Apple("GetApple2");
	}

	@Bean
	public Apple GETApple3() {
		return new Apple("GETApple3");
	}

}
