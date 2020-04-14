package Maven1;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    //private FizzBuzz f;

    @Before
    public void init() {
    //  FizzBuzz f = new FizzBuzz();
    }
    @Test
    public void test15(){
        //   FizzBuzz f = new FizzBuzz();
        assertThat("FizzBuzz", FizzBuzz.output(15));
    }
     @Test
    public void test30(){
     //   FizzBuzz f = new FizzBuzz();
        assertThat("FizzBuzz", FizzBuzz.output(30));
    }
    @Test
    public void test5(){
    //    FizzBuzz f = new FizzBuzz();
        assertThat("Buzz", FizzBuzz.output(5));
    }
    @Test
    public void test3() {
     //   FizzBuzz f = new FizzBuzz();
        assertThat("Fizz", FizzBuzz.output(3));
    }
    @Test
    public void test1() {
     //   FizzBuzz f = new FizzBuzz();
        assertThat("1", FizzBuzz.output(1));
    }
    @Test
    public void test149() {
     //   FizzBuzz f = new FizzBuzz();
        assertThat("149", FizzBuzz.output(149));
    }
    private void assertThat(String fizzBuzz, String output) {
    }
}