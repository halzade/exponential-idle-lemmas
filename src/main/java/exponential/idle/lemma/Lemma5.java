package exponential.idle.lemma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lemma5 {

    private static final Logger log = LogManager.getLogger(Lemma5.class);

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {

            int max = 0;
            for (int ci = 1; ci < 100; ci++) {
                int result = ((ci * ci * ci * ci) * ((2 * (i * i)) - ci));
                if (result > max) {
                    max = result;
                }
                if (result < max) {
                    log.info("i = " + i + ", ci = " + (ci - 1));
                    break;
                }
            }
        }
    }
}
