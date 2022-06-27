package exponential.idle.lemma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lemma6 {

    private static final Logger log = LogManager.getLogger(Lemma6.class);

    public static void main(String[] args) {

        final double oe = 1 / Math.E;
        final double opi = 1 / Math.PI;

        double min = 10.0;

        for (double i = 1; i < 1000; i++) {
            for (double j = i; j < 1000; j++) {
                double c3 = Math.pow(i, oe);
                double c4 = Math.pow(j, opi);
                double res = c3 - c4;

                if (res < 0) {
                    break;
                } else {
                    if (res < min && res > 0) {
                        log.info("c4=" + i + ", c4=" + j + ": " + res);
                        min = res;
                    }
                }
            }
        }
    }
}
