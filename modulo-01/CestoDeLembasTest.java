import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CestoDeLembasTest{
    
    @Test
    public void cestoIniciaComLembas(){
        //Arrange
        
        //Act
        CestoDeLembas cesto = new CestoDeLembas(42);
        //Assert
        assertEquals(42, cesto.getQuantidade());
    }
    
    @Test
    public void cestoDivisivelEmPares(){
        //Arrange
        
        //Act
        CestoDeLembas cesto = new CestoDeLembas(42);
        //Assert
        assertTrue(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoComQuatroPaes(){
        //Arrange
        CestoDeLembas cesto = new CestoDeLembas(4);
        //Act & Assert
        assertTrue(cesto.podeDividirEmPares());
    }
}
