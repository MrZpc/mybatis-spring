import com.zengpc.Configuration;
import com.zengpc.dao.UserDao;
import com.zengpc.session.SqlSession;
import com.zengpc.session.SqlSessionFactory;
import com.zengpc.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = MyBatisTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        Configuration configuration = new Configuration();
        configuration.setInputStream(inputStream);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        SqlSession sqlSession = sqlSessionFactory.openSession(configuration);
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        System.out.println(userDao.getUsers());


    }
}
