package pl.mateuszwarzyc.behavioral.chainOfResponsibility.example;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Coffee13.
 */
public class ChainofResponsibillityExample {

    private static final Logger LOGGER = Logger.getLogger(ChainofResponsibillityExample.class.getName());

    public static void main(String[] args) {

        //level to log at
        LOGGER.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();
        //level to publish at
        handler.setLevel(Level.FINER);
        LOGGER.addHandler(handler);

        LOGGER.finest("Finest level of logging"); //this wont print
        LOGGER.finer("Finer level, but not as fine as finest");
        LOGGER.fine("Fine, but not as fine as finer or finest");

    }
}
