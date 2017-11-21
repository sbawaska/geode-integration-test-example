import org.apache.geode.test.junit.rules.gfsh.GfshRule;
import org.apache.geode.test.junit.rules.gfsh.GfshScript;
import org.junit.Rule;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'sbawaskar' at '10/28/17 1:47 PM' with Gradle 2.12
 *
 * @author sbawaskar, @date 10/28/17 1:47 PM
 */
public class LibraryTest {
    @Rule
    public GfshRule gfshRule = new GfshRule();

    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        GfshScript.of("start locator --name=loc",
            "start server --name=serv1",
            "create region --name=test --type=REPLICATE").execute(gfshRule);
        classUnderTest.doPut();
        assertEquals("one", classUnderTest.doGet());
    }
}
