import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("defaultBean.xml");
		DefaultMessage d = context.getBean(DefaultMessage.class);
		System.out.println("Message of bean : "+d.getMsg());
	}

}
