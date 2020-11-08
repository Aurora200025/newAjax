package selectTest.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MySqlSession {

    private static SqlSessionFactory factory;
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream input = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("selectTest/mysql.xml");
        factory = builder.build(input);
    }

    public static SqlSession getSqlSession() {
        return factory.openSession();
    }
    public static SqlSession getSqlSession(boolean flag) {
        return factory.openSession(flag);
    }

    public static <T>T getMapper(Class clazz) {
        return (T) getSqlSession().getMapper(clazz);
    }
    public static <T>T getMapper(Class clazz, boolean flag) {
        return (T) getSqlSession(flag).getMapper(clazz);
    }
}
