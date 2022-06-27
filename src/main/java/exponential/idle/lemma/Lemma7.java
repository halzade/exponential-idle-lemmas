package exponential.idle.lemma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static exponential.idle.formatter.Formatter.left;
import static exponential.idle.formatter.Formatter.right;
import static java.lang.Math.E;

public class Lemma7 {

    private static final Logger log = LogManager.getLogger(Lemma7.class);

    public static void main(String[] args) {

        double min = 10.0;

        for (int c1 = 1; c1 < 2000; c1++) {
            for (int c2 = 1; c2 < 2000; c2++) {

                /*
                 * e - c1/c2
                 */
                double res = Math.abs(E - ((double) c1 / (double) c2));

                if (res < min && res > 0) {
                    log.info("Best e approximation "
                            + left(" c1 = " + c1, 11)
                            + left(" c2 = " + c2, 10)
                            + " error = "
                            + right(res, 8));
                    min = res;
                }
            }
        }
    }
}
