package practs_koshynskyi.pract15_koshynskyi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepRunner {
    public static void run(Object target) throws InvocationTargetException, IllegalAccessException {
        List<Method> methodList = List.of(target.getClass().getMethods());
        List<Method> methodsToUse = methodList.stream().filter(method -> method.isAnnotationPresent(Step.class))
                .sorted((o1, o2) -> Long.compare(o1.getAnnotation(Step.class).order(),
                        o2.getAnnotation(Step.class).order())).toList();
        for (Method method : methodsToUse) {
            method.setAccessible(true);
            if (method.getParameters().length > 0 && !method.getReturnType().equals(void.class)) {
                throw new SignatureException("incorectSignature");
            }
            try {
                method.invoke(target);
            }catch (Exception e) {
                throw new StepMethodException(e.getMessage(), e);
            }
        }
    }
}
