package practs_koshynskyi.pract15_koshynskyi;

import java.util.List;

public class ClassInfoPrinter {
    public static void print(Class<?> clazz){
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass());
        System.out.println(clazz.getInterfaces());
        System.out.println(List.of(clazz.getDeclaredFields()));
        System.out.println(List.of(clazz.getDeclaredMethods()));

    }
}
