package Exercise;

import org.slf4j.Logger;

//Explanation
//Imports the Logger interface from SLF4J.
//Logger provides methods such as:
//info()
//debug()
//warn()
//error()
//trace()
//Without this import, Java does not know what Logger is.

import org.slf4j.LoggerFactory;

//Explanation
//Imports the LoggerFactory class.
//LoggerFactory is used to create a Logger object.

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class); 
    //---getLogger() creates (or returns) a Logger object for a specific class.

//    static
//    Means:
//    Only one logger object is created for the entire class.
//    It belongs to the class, not to individual objects.
//    Without static, a new logger would be created for every object, which is unnecessary.
    
    public static void main(String[] args) {

        logger.error("This is an error message");

        logger.warn("This is a warning message");

    }
}