

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CestoDeLembasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
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
    public void cestoDivisivelPorDois(){
        //Arrange
        
        //Act
        CestoDeLembas cesto = new CestoDeLembas(42);
        //Assert
        assertEquals(true, cesto.cestoDivisivel());
    }
}
