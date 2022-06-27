package exponential.idle.lemma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static exponential.idle.formatter.Formatter.left;
import static exponential.idle.formatter.Formatter.right;

public class Lemma6 {

    private static final Logger log = LogManager.getLogger(Lemma6.class);

    public static void main(String[] args) {

        final double oe = 1 / Math.E;
        final double opi = 1 / Math.PI;

        double min = 10.0;

        for (int i = 1; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                double c3 = Math.pow(i, oe);
                double c4 = Math.pow(j, opi);

                /*
                 * i^-e - j^-pi
                 */
                double res = c3 - c4;

                if (res < 0) {
                    break;
                } else {
                    if (res < min && res > 0) {
                        log.info("Best divisor values "
                                + left(" c3 = " + i, 10)
                                + left(" c4 = " + j, 10)
                                + " result = "
                                + right(res, 7));
                        min = res;
                    }
                }
            }
        }
    }
}
