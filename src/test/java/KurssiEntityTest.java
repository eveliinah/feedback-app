import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import com.example.application.data.entity.Kurssi;
import com.example.application.data.entity.User;

public class KurssiEntityTest {

    private Kurssi kurssi;
    private User user;

    @Before
    public void setUp() {
        user = new User();
        kurssi = new Kurssi("Testikurssi", "TK01", Date.valueOf("2023-06-01"), Date.valueOf("2023-07-01"), user);
    }

    @Test
    public void testGetNimi() {
        assertEquals("Testikurssi", kurssi.getNimi());
    }

    @Test
    public void testSetNimi() {
        kurssi.setNimi("Uusi kurssi");
        assertEquals("Uusi kurssi", kurssi.getNimi());
    }

    @Test
    public void testGetKoodi() {
        assertEquals("TK01", kurssi.getKoodi());
    }

    @Test
    public void testSetKoodi() {
        kurssi.setKoodi("UK01");
        assertEquals("UK01", kurssi.getKoodi());
    }

    @Test
    public void testGetAloitusPvm() {
        assertEquals(Date.valueOf("2023-06-01"), kurssi.getAloitusPvm());
    }

    @Test
    public void testSetAloitusPvm() {
        kurssi.setAloitusPvm(Date.valueOf("2023-07-01"));
        assertEquals(Date.valueOf("2023-07-01"), kurssi.getAloitusPvm());
    }

    @Test
    public void testGetLopetusPvm() {
        assertEquals(Date.valueOf("2023-07-01"), kurssi.getLopetusPvm());
    }

    @Test
    public void testSetLopetusPvm() {
        kurssi.setLopetusPvm(Date.valueOf("2023-08-01"));
        assertEquals(Date.valueOf("2023-08-01"), kurssi.getLopetusPvm());
    }

    @Test
    public void testGetUser() {
        assertEquals(user, kurssi.getUser());
    }

    @Test
    public void testSetId() {
        kurssi.setId(1);
        assertEquals(1, kurssi.getId());
    }

}
