package utils;
import org.apache.log4j.Logger;

public class Log {
    // To initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName());

    // To print log at the start of test case
    public static void startTestCase(String sTestCaseName){
        Log.info("XXXXXXXXXXX");
        Log.info("XXXXXXXXXXXXXXXX");
        Log.info("XXXXXXXXXXXXXXXXXXXXXX");
        Log.info("========================================================================================");
        Log.info("-----------*<( "+sTestCaseName+"  )>*-----------");
        Log.info("========================================================================================");
    }

    // To print log at the end of test case
    public static void endTestCase(String sTestCaseName){
        Log.info("========================================================================================");
        Log.info("-----------*<( "+sTestCaseName+"  )>*-----------");
        Log.info("-----------*<( The End of Test Case  )>*-----------");
        Log.info("========================================================================================");
        Log.info("XXXXXXXXXXXXXXXXXXXXXX");
        Log.info("XXXXXXXXXXXXXXXX");
        Log.info("XXXXXXXXXXX");

    }
    // Log methods to used for logging
    public static void info(String message) {Log.info(message);}
    public static void warn(String message) {Log.warn(message);}
    public static void error(String message) {Log.error(message);}
    public static void fatal(String message) {Log.fatal(message);}
    public static void debug(String message) {Log.debug(message);}
}

