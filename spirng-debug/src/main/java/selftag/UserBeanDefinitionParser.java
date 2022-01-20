package selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @ClassName: UserBeanDefinitionParser
 * @Description:
 * @Author: fan jin yang
 * @Date: 2022/1/19
 * @Version: 1.0.0
 **/
public class UserBeanDefinitionParser  extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		// 返回属性值所对应的对象
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具备的属性值
		String username = element.getAttribute("username");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if(StringUtils.hasText(username)){
			builder.addPropertyValue("username",username);
		}

		if(StringUtils.hasText(email)){
			builder.addPropertyValue("email",email);
		}

		if(StringUtils.hasText(password)){
			builder.addPropertyValue("password",password);
		}
	}
}
