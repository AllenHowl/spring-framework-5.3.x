package bean;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @ClassName: A
 * @Description:
 * @Author: fan jin yang
 * @Date: 2021/12/31
 * @Version: 1.0.0
 **/
public class A implements BeanNameAware, Aware {

	private String beanName;


	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}
}
