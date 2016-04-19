package springDemo;

import java.io.FileInputStream;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new FileSystemResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		
	 
		Test test = (Test)factory.getBean("test");
		test.WriteHelloWorld();

	}

}
