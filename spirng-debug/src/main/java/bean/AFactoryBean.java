package bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: AFactoryBean
 * @Description:
 * @Author: fan jin yang
 * @Date: 2021/12/31
 * @Version: 1.0.0
 **/
public class AFactoryBean implements FactoryBean<A>, BeanNameAware {

	private String beanName;

	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}
}
