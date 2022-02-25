package Learning.javaCode.testNGEx;

import org.testng.annotations.Test;
import Learning.javaCode.seleniumCode.FirstSeleniumEx;

public class ExecutionEx {

    @Test(groups = {"regression", "sanity"})
    public void m2() throws InterruptedException {
        FirstSeleniumEx ex= new FirstSeleniumEx();
        ex.test1();

    }

}
