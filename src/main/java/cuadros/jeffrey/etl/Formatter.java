package cuadros.jeffrey.etl;

public class Formatter {
    public String clean(String test_one) {
        String dirty = test_one;
        String clean = dirty.replaceAll("[^()]", "");

        return clean;
    }
}
