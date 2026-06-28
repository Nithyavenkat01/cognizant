package Exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Nithya";
        int age = 20;
        double salary = 25000.50;

        logger.info("Employee Name: {}", name);

        logger.info("Employee Age: {}", age);

        logger.info("Employee Salary: {}", salary);

        logger.info("{} is {} years old.", name, age);
    }
}