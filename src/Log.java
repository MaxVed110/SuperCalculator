import org.apache.log4j.Logger;

public class Log {
    private static Logger log;

    public Log(String className) {
        log = Logger.getLogger(getSimpleName(className));
    }

    public void LogInfo(String message) {
        log.info(message);
    }

    public void LogDebug(String message) {
        log.debug(message);
    }

    public String getSimpleName(String className) {
        return "[" + className + "]";
    }
}
