package lisners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(lisners.TestNGListener.class)
public class TestNGListenerDemo {

    @Test
    public void test1() {
        System.out.println("I am inside Test 1");
    }

    @Test
    public void test2() {
        System.out.println("I am inside Test 2");
    }

    @Test
    public void test3() {
        System.out.println("I am inside Test 3");
    }
}
