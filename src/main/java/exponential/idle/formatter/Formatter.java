package exponential.idle.formatter;

public class Formatter {

    public static String left(String string, int places) {
        return String.format("%-" + places + "s", string);
    }

    public static String right(double number, int places) {
        return String.format("%." + places + "f", number);
    }
}
