import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Test
 * @Description:
 * @Author: fan jin yang
 * @Date: 2021/12/28
 * @Version: 1.0.0
 **/
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	}
}
