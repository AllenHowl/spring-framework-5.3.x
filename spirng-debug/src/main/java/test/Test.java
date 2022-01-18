package test;

import bean.A;
import bean.AFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import other.MyClassPathXmlApplicationContext;

/**
 * @ClassName: test.Test
 * @Description:
 * @Author: fan jin yang
 * @Date: 2021/12/30
 * @Version: 1.0.0
 **/
public class Test {
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//		A af = (A) ac.getBean("AF");
//		AFactoryBean afc = (AFactoryBean) ac.getBean("&AF");
//		System.out.println("部署起来啦");
//		System.out.println(af.getClass());
//		System.out.println(afc.getClass());


		ApplicationContext ac = new MyClassPathXmlApplicationContext("spring.xml");
		A bean = (A) ac.getBean("a1");

	}
}
