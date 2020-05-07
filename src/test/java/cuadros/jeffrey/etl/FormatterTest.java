package cuadros.jeffrey.etl;

import org.junit.Assert;
import org.junit.Test;

public class FormatterTest {

    @Test
    public void test_case_one(){
        Formatter formatter = new Formatter();
        String test_one = "sajslkalskjalskj))";
        String clean = formatter.clean(test_one);
        PairFinder pairFinder = new PairFinder();
        Integer actual = pairFinder.find(clean);

        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case_two(){
        Formatter formatter = new Formatter();
        String test_one = "(((())8(((/((()()()()(/(()()()(/()(/()(/()(/()(/";
        String clean = formatter.clean(test_one);
        PairFinder pairFinder = new PairFinder();
        Integer actual = pairFinder.find(clean);

        Integer expected = 13;

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void test_case_three(){
        Formatter formatter = new Formatter();
        String test_one = "(())";
        String clean = formatter.clean(test_one);
        PairFinder pairFinder = new PairFinder();
        Integer actual = pairFinder.find(clean);

        Integer expected = 2;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test_case_four(){
        Formatter formatter = new Formatter();
        String test_one = "dakjsdhakjdshajshd)(((9()()('0'0¿0'0809(";
        String clean = formatter.clean(test_one);
        PairFinder pairFinder = new PairFinder();
        Integer actual = pairFinder.find(clean);

        Integer expected = 2;

        Assert.assertEquals(expected, actual);

    }

}
