package practs_koshynskyi.pract7_koshynskyi;

public class SimpleLogger implements  Logger {
    Class<?> clazz;
    public SimpleLogger(Class<?> clazz) {
        this.clazz = clazz;
    }
    @Override
    public void info(String message, Object... args) {
        System.out.println("Info : " + clazz.getSimpleName() + " : "+ replace(message, args));
    }

    @Override
    public void warn(String message, Object... args) {
        System.out.println("Warn : "+ clazz.getSimpleName() + " : " + replace(message, args));
    }

    @Override
    public void error(String message, Object... args) {
        System.out.println("Eror : " + clazz.getSimpleName() + " : " + replace(message, args));
    }
    private String replace(String message, Object... args){
        for (Object arg : args) {
            String value = String.valueOf(arg);
            message = message.replaceFirst("\\{\\}", value);
        }
        return message;
    }
}
