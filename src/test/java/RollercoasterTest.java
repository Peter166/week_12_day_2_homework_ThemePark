import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor tallVisitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Death", 10, 0, 8.4);
        visitor = new Visitor("Looser", 20,20,180);
        tallVisitor = new Visitor("Bob", 13, 30, 210);

    }

    @Test
    public void canAddVisitor(){
        rollercoaster.ticket(visitor);
        assertEquals(1, rollercoaster.getVisitCount());
    }

    @Test
    public void canAddTallVisitor(){
        rollercoaster.ticket(tallVisitor);
        assertEquals(13.2, tallVisitor.getMoney(), 0.01);
    }

    @Test
    public void canDeductMoney(){
        rollercoaster.ticket(visitor);
        assertEquals(11.6, visitor.getMoney(), 0.01);
    }


    @Test
    public void canCheckRating(){
        assertEquals(10, rollercoaster.getRating(), 0.01);
    }

}
