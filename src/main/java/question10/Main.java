package question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("acaBean.xml");
		ACA aca = (ACA) context.getBean("collction");
		aca.print();

}
}
