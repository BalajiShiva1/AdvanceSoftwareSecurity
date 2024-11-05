import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4jFuzzing {
    private static final Logger logger = LogManager.getLogger(Log4jFuzzing.class);

    public static void main(String[] args) {
        if (args.length > 0) {
            String userInput = args[0];
            logger.info("User input: " + userInput);
        }
    }
}
