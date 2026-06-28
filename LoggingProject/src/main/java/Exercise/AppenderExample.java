package Exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

    private static final Logger logger =
            LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {

        logger.trace("This is a TRACE message");
//        TRACE is the most detailed logging level.
//        It is used to record every small step in the program, mainly for debugging complex problems.
        
        logger.debug("This is a DEBUG message");
//        DEBUG is used to record information that helps developers find and fix bugs.
//        It provides useful information during development but is usually disabled in production.
        
        logger.info("This is an INFO message");
//        INFO records normal application events.
//        These messages indicate that the application is working as expected.

        logger.warn("This is a WARN message");
//        WARN means something unexpected happened, but the application can continue running.
//        It is not a failure, but it should be checked.

        logger.error("This is an ERROR message");
//        ERROR indicates a serious problem.
//        The requested operation failed, although the application may still continue running.

    }
}