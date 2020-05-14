import com.zengpcSpring.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = context.getBean(UserDao.class);
        userDao.getUsers().forEach(a-> System.out.println(a.toString()));
    }
}
