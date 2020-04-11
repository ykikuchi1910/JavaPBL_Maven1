package Maven1;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz f;

    @Before
    public void init() {
        FizzBuzz f = new FizzBuzz();
    }

    @Test
    public void test15(){
     //   FizzBuzz f = new FizzBuzz();
        assertThat("FizzBuzz", FizzBuzz.Output(15));
    }
    @Test
    public void test5(){
    //    FizzBuzz f = new FizzBuzz();
        assertThat("Buzz", FizzBuzz.Output(5));
    }
    @Test
    public void test3() {
     //   FizzBuzz f = new FizzBuzz();
        assertThat("Fizz", FizzBuzz.Output(3));
    }
    @Test
    public void test1() {
     //   FizzBuzz f = new FizzBuzz();
        assertThat("1", FizzBuzz.Output(1));
    }
    @Test
    public void test149() {
     //   FizzBuzz f = new FizzBuzz();
        assertThat("149", FizzBuzz.Output(149));
    }
    private void assertThat(String fizzBuzz, String output) {
    }
}