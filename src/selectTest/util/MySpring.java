package selectTest.util;

import java.util.HashMap;

public class MySpring {

    private static HashMap<String, Object> beanMap;

    public static  <T> T getBean(String className) {
        T obj = (T) beanMap.get(className);
        if (obj == null) {
            try {
                Class clazz = Class.forName(className);
                obj = (T) clazz.getNestHost();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return  obj;
    }
}
