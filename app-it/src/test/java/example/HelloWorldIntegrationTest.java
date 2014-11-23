package example;

import org.junit.Test;

public class HelloWorldIntegrationTest {

    @Test
    public void test() {
        new HelloWorld().coveredByIntegrationTest();
    }

    @Test
    public void testUT() {
        new HelloWorld().coveredByUnitTest();
    }

    @Test
    public void testNotCovered() {
        new HelloWorld().notCovered();
    }

    @Test
    public void testDuplicated() {
        new HelloWorld().coveredByUnitTest();
        new HelloWorld().coveredByIntegrationTest();
    }

}
