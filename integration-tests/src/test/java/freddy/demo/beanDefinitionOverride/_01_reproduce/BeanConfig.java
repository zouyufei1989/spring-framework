package freddy.demo.beanDefinitionOverride._01_reproduce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"freddy.demo.beanDefinitionOverride._01_reproduce"})
public class BeanConfig {

	@Bean(name = "bigApple")
	public Apple getApple1() {
		return new Apple("big apple1");
	}

	@Bean(name = "bigApple")
	public Apple getApple2() {
		return new Apple("big apple2");
	}

	@Bean(name = "apple")
	public Apple getApple3() {
		return new Apple("apple3");
	}

}
