import java.util.logging.Level;
import java.util.logging.Logger;

public class LogerExample {
    private static Logger logger = Logger.getLogger(LogerExample.class.getName());
    public void doFoo () {
        logger.info("Writing to log some info.");
        logger.log(Level.WARNING, "Writing to log some warnings.");
    }

}
