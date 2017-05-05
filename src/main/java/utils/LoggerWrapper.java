package utils;

import org.apache.log4j.Logger;

/**
 * Created by Diana on 05.05.2017.
 */
public class LoggerWrapper {

    private static final Logger LOGGER = Logger.getLogger(LoggerWrapper.class);

    private static LoggerWrapper logger;

    private LoggerWrapper() {

    }

    public static LoggerWrapper getLogger() {
        if (logger == null) {
            logger = new LoggerWrapper();
        }
        return logger;
    }

    public void fatal(String message) {
        LOGGER.fatal("/r/n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^FATAL log message" + message);
    }

    public void error(String message) {
        LOGGER.error("++++++++++++++++++++++++++++++++++++++++++++++++ERROR log message" + message);
    }

    public void warn(String message) {
        LOGGER.warn("/r/n*************************************************WARN log message" + message);
    }

    public void info(String message) {
        LOGGER.info("/r/n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%INFO log message" + message);
    }

    public void debug(String message) {
        LOGGER.debug("================================================DEBUG log message" + message);
    }

    public void trace(String message) {
        LOGGER.trace("------------------------------------------------TRACE log message" + message);
    }

}
