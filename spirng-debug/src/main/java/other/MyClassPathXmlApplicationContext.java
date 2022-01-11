package other;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: other.MyClassPathXmlApplicationContext
 * @Description:
 * @Author: fan jin yang
 * @Date: 2022/1/6
 * @Version: 1.0.0
 **/
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


	public MyClassPathXmlApplicationContext(String ... configuration) {
		super(configuration);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
//		System.out.println(getEnvironment().getRequiredProperty("username"));

	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		System.out.println("走进这个方法");
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
		super.customizeBeanFactory(beanFactory);

	}


}
