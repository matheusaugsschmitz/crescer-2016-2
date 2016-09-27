import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoTest{
    
    @Test
    public void elfoNasceComNome(){
        //ArrangebruceWayne
        String nomeEsperado = "Bruce Wayne";
        //Act
        Elfo bruceWayne = new Elfo(nomeEsperado);
        //Assert
        assertEquals(nomeEsperado, bruceWayne.getNome());
    }
    
    @Test
    public void elfoNasceComArco(){
        //ArrangebruceWayne
        //Act
        Elfo bruceWayne = new Elfo("Shazam");
        //Assert
        assertEquals("Arco", bruceWayne.getArco().getDescricao());
        assertEquals(1, bruceWayne.getArco().getQuantidade());
    }
}
