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
        //Arrange
        String nomeEsperado = "Bruce Wayne";
        //Act
        Elfo elfo = new Elfo(nomeEsperado);
        //Assert
        assertEquals(nomeEsperado, elfo.getNome());
    }
    
    @Test
    public void elfoNasceComArco(){
        //Arrange
        //Act
        Elfo elfo = new Elfo("Shazam");
        //Assert
        assertEquals("Arco", elfo.getArco().getDescricao());
        assertEquals(1, elfo.getArco().getQuantidade());
    }
    
    @Test
    public void elfoNasceComFlechas(){
        //Arrange
        //Act
        Elfo elfo = new Elfo("Shazam");
        //Assert
        assertEquals("Flecha", elfo.getFlecha().getDescricao());
        assertEquals(42, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNasceSemExp(){
        //Arrange
        //Act
        Elfo elfo = new Elfo("Shazam");
        //Assert
        assertEquals(0, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlecha(){
        //Arrange
        Elfo elfo = new Elfo("Shazam");
        //Act
        elfo.atirarFlecha();
        //Assert
        assertEquals(41, elfo.getFlecha().getQuantidade());
        assertEquals(1, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlechas(){
        //Arrange
        Elfo elfo = new Elfo("Shazam");
        //Act
        for(int i = 0; i < 40; i++){
            elfo.atirarFlecha();
        }
        //Assert
        assertEquals(2, elfo.getFlecha().getQuantidade());
        assertEquals(40, elfo.getExp());
    }
    
    @Test
    public void flecharAnao(){
        //Arrange
        Elfo elfo = new Elfo("Shazam");
        Dwarve anao = new Dwarve();
        //Act
        elfo.flecharDwarve(anao);
        //Assert
        assertEquals(100, anao.getVida());
        assertEquals(41, elfo.getFlecha().getQuantidade());
    }
}
