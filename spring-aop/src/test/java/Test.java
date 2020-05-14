import com.zengpc.UserService;
import com.zengpc.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.add();
    }
}
