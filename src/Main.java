import java.io.IOException;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) throws IOException {

        log.debug("Start");
        App run = new App();
        run.start();

    }
}
