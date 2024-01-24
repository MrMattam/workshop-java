package fr.mbo.workshops.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerMain {

    private static Logger LOGGER = LoggerFactory.getLogger(LoggerMain.class);

    public static void main(String[] args) {

        LOGGER.info("Coucou");


    }

}
