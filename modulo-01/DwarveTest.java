

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DwarvesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DwarveTest{
    
    @Test
    public void vidaDwarvesAoNascer(){
        //Arrange
        
        //Act
        Dwarve anao = new Dwarve();
        //Assert
        assertEquals(110, anao.getVida());
    }
    
    @Test
    public void dwarveLevandoFlechada(){
        //Arrange
        Dwarve anao = new Dwarve();
        //Act
        anao.levaFlechada();
        //Assert
        assertEquals(100, anao.getVida());
    }
}
