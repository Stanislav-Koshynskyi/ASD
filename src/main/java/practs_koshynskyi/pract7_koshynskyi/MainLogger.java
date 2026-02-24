package practs_koshynskyi.pract7_koshynskyi;

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(MainLogger.class);
        logger.info("Some info {}", "info");
        logger.warn("Some warn {}", "warn");
        logger.error("Some error {}", "error");
    }
}