package javaskill.basicoperations;
/**
*@author    created by Teddy
*@date  Jul 22, 2020---3:28:20 PM
*/

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LambdaExpressionsIntegrationTest {

    private static final Logger logger = LogManager.getRootLogger();

    @Test
    public void whenCheckLogMessage_thenOk() {
        if (logger.isTraceEnabled()) {
            logger.info("Numer is {}", getRandomNumber());
        }
    }

    @Test
    public void whenUseLambdaExpression_thenOk() {
        logger.debug("Number is {}", () -> getRandomNumber());
        logger.info("Name is {} and age is {}", () -> getName(), () -> getRandomNumber());
    }

    private int getRandomNumber() {
        return (new Random()).nextInt(10);
    }

    private String getName() {
        return "John";
    }
}
