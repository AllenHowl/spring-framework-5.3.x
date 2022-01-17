package bean;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @ClassName: A
 * @Description:
 * @Author: fan jin yang
 * @Date: 2021/12/31
 * @Version: 1.0.0
 **/
public class A implements BeanNameAware, EnvironmentAware {

	private String beanName;

	private Environment environment;

	private String id;

	private String name;

	public A() {
	}

	public A(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
