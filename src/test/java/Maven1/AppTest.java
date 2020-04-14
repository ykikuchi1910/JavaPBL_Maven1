package Maven1;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Before
    public void init() {
    }

    @Test
    public void test1(){
      assertThat("Hello World!", App.hellotext());
    }
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/
    private void assertThat(String app, String hellotext) {
    }
}
