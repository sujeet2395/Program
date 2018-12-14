package Fun;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AddClassTest {
    private String first;
    private String second;
    private int expected;
    private AddClass addclass;
    public AddClassTest(String first, String second, int expected) {
        this.first=first;
        this.second=second;
        this.expected=expected;
    }
    
    @Before
    public void setUp() {
        addclass=new AddClass();
    }

    @Parameterized.Parameters
    public static Collection values() {
        return Arrays.asList(new Object[][] {
            { "2", "3", 5 },
            { "6", "4", 10 },
            { "3", "-1", 2 },
            { "3", "0", 3 },
            { "6", "-6", 0 }
        });
    }
    @Test
    public void addOfAddClasstest() {
        //assertTrue(addclass.add(first, second)==expected);
        assertEquals(expected,addclass.add(first, second));
    }
}
