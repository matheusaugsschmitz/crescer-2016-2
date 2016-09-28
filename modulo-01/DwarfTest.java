

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
public class DwarfTest{
    
    @Test
    public void vidaDwarvesAoNascer(){
        //Arrange
        
        //Act
        Dwarf anao = new Dwarf();
        //Assert
        assertEquals(110, anao.getVida());
    }
    
    @Test
    public void dwarveLevandoFlechada(){
        //Arrange
        Dwarf anao = new Dwarf();
        //Act
        anao.perderVida();
        //Assert
        assertEquals(100, anao.getVida());
    }
}
