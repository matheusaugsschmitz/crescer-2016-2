

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
    public void vidaDwarfAoNascer(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);        
        //Act
        Dwarf anao = new Dwarf("Smiggle", data);
        //Assert
        assertEquals(110, anao.getVida());
    }
    
    @Test
    public void dwarfLevandoFlechada(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016); 
        Dwarf anao = new Dwarf("Smiggle", data);
        //Act
        anao.perderVida();
        //Assert
        assertEquals(100, anao.getVida());
    }
    
    @Test
    public void dwarfRecebeNomeEDataNascimento(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016); 
        Dwarf anao = new Dwarf("Smiggle", data);
        assertEquals("Smiggle", anao.getNome());
        assertEquals(1, anao.getDataNascimento().getDia());
        assertEquals(9, anao.getDataNascimento().getMes());
        assertEquals(3016, anao.getDataNascimento().getAno());
    }
    
    @Test
    public void dwarfSemNomeRecebeDataNascimento(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016); 
        Dwarf anao = new Dwarf("", data);
        assertEquals("", anao.getNome());
        assertEquals(1, anao.getDataNascimento().getDia());
        assertEquals(9, anao.getDataNascimento().getMes());
        assertEquals(3016, anao.getDataNascimento().getAno());
    }
    
    @Test
    public void dwarfGetNumeroSorteAno2016(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016); 
        Dwarf anao = new Dwarf("Smiggle", data);
        assertEquals(101.0, anao.getNumeroSorte(), 0);
    }
    
    @Test
    public void dwarfGetNumeroSorteAno3079(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3079); 
        Dwarf anao = new Dwarf("Smiggle", data);
        assertEquals(101.0, anao.getNumeroSorte(), 0);
    }
    
    @Test
    public void dwarfSeixasGetNumeroSorteAno3079(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3079); 
        Dwarf anao = new Dwarf("Seixas", data);
        assertEquals(33.0, anao.getNumeroSorte(), 0);
    }
    
    @Test
    public void dwarfSeixasGetNumeroSorteAno2016Com90DeVida(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016); 
        Dwarf anao = new Dwarf("Seixas", data);
        anao.perderVida();
        anao.perderVida();
        assertEquals(-3333, anao.getNumeroSorte(), 0);
    }
}
