package nst.processors.sample;

import org.apache.nifi.util.TestRunner;
import org.apache.nifi.util.TestRunners;
import org.junit.Before;
import org.junit.Test;


public class Put2SQLTest {

    private TestRunner testRunner;

    @Before
    public void init() {
        testRunner = TestRunners.newTestRunner(Put2SQL.class);
    }

    @Test
    public void testProcessor() {

    }

}
