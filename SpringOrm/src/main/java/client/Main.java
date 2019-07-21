package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.bo.TestBean;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean=(TestBean)ctx.getBean("testBean");
		//testBean.persistEmp(110, "pawan", 9988, 30);
		System.out.println("=======================");
		//testBean.updateEmp(110, "Bond", 8800, 30);
		//testBean.deleteEmp(112);
		testBean.selectEmp();

	}

}
