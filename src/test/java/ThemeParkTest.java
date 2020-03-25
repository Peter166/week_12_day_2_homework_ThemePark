import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor tallVisitor;


    @Before

    public void before(){
        rollercoaster = new Rollercoaster("Death", 10, 0, 8.4);
        visitor = new Visitor("Looser", 20,20,180);
        tallVisitor = new Visitor("Bob", 13, 30, 210);
        themePark = new ThemePark("Die Land");
    }

    @Test
    public void canAddToArray(){
        themePark.connect(rollercoaster);
        assertEquals(1, themePark.);
    }
}
