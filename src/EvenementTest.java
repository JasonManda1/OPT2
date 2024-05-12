import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class EvenementTest {
    @Test
    public void testEvenementNaam() {
        Evenement evenement = new Evenement("TestEvenement", new ArrayList<>());
        assertEquals("TestEvenement", evenement.getNaam());
    }

    @Test
    public void testTheaterzaalDuur() {
        Theaterzaal theaterzaal = new Theaterzaal("Theaterzaal", 4);
        assertEquals(4, theaterzaal.duur());
    }

    @Test
    public void testStoelenDuur() {
        Stoelen stoelen = new Stoelen("Stoelen", 3);
        assertEquals(3, stoelen.duur());
    }
}

