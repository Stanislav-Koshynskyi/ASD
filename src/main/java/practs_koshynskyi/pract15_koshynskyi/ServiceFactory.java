package practs_koshynskyi.pract15_koshynskyi;

import java.lang.reflect.InvocationTargetException;

public class ServiceFactory {
    public static Object create(String className) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("not found");
        }
        return clazz.getConstructor().newInstance();
    }
}
