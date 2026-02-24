package practs_koshynskyi.pract7_koshynskyi;

public class LoggerFactory {
    public static Logger getLogger(Class<?> clazz) {
        return new SimpleLogger(clazz);
    }
}
