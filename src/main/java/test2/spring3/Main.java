package test2.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		Beans beans = (Beans)factory.getBean("Beans");
		beans.sayHello();
	}

}
