package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

public class Driver {

	
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("mycore.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		Car car=(Car) bf.getBean("mycar");
		car.work();

	}
}
