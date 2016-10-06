import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTerceiraEraTest{
    
    @Test
    public void dataTerceiraEra(){
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 3019);
        assertEquals(1, data.getDia());
        assertEquals(10, data.getMes());
        assertEquals(3019, data.getAno());
    }
    
    @Test
    public void dataNegativa(){
        DataTerceiraEra data = new DataTerceiraEra(-7, -9, -9000);
        assertEquals(-7, data.getDia());
        assertEquals(-9, data.getMes());
        assertEquals(-9000, data.getAno());
    }
    
    @Test
    public void dia40Mes19Ano70000(){
        DataTerceiraEra data = new DataTerceiraEra(40, 19, 70000);
        assertEquals(40, data.getDia());
        assertEquals(19, data.getMes());
        assertEquals(70000, data.getAno());
    }    
    
    @Test
    public void ehBissexto1004(){
        assertTrue(new DataTerceiraEra(29, 02, 1004).ehBissexto());
    }
    
    @Test
    public void ehBissexto2016(){
        DataTerceiraEra data = new DataTerceiraEra(29, 02, 2016);
        assertTrue(data.ehBissexto());
    }
    
    @Test
    public void ehBissexto3079(){
        DataTerceiraEra data = new DataTerceiraEra(29, 02, 3079);
        assertFalse(data.ehBissexto());
    }
    
    
}
