package selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;

/**
 * @ClassName: UserNameSpaceHandler
 * @Description:
 * @Author: fan jin yang
 * @Date: 2022/1/19
 * @Version: 1.0.0
 **/
public class UserNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		this.registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
