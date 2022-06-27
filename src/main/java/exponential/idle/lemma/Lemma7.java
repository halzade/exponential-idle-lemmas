package exponential.idle.lemma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lemma7 {

    private static final Logger log = LogManager.getLogger(Lemma7.class);

    public static void main(String[] args) {

        final double e = Math.E;

        double min = 10.0;

        for (double c1 = 1; c1 < 2000; c1++) {
            for (double c2 = 1; c2 < 2000; c2++) {

                double res = Math.abs(e - (c1 / c2));

                if (res < min && res > 0) {
                    log.info(c1 + ", " + c2 + ": " + res);
                    min = res;
                }
            }
        }
    }
}
