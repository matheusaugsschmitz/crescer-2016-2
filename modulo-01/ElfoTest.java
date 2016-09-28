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
    public void elfoNasceCom42Flechas(){
        //Arrange
        //Act
        Elfo elfo = new Elfo("Batman");
        //Assert
        assertEquals("Flecha", elfo.getFlecha().getDescricao());
        assertEquals(42, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNasceSemExp(){
        //Arrange
        //Act
        Elfo elfo = new Elfo("Cleber");
        //Assert
        assertEquals(0, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlecha(){
        //Arrange
        Elfo elfo = new Elfo("Robin Wood");
        //Act
        elfo.atirarFlechaEmDwarf(new Dwarf());
        //Assert
        assertEquals(41, elfo.getFlecha().getQuantidade());
        assertEquals(1, elfo.getExp());
    }
    
    @Test
    public void elfoAtira40Flechas(){
        //Arrange
        Elfo elfo = new Elfo("Judas");
        //Act
        for(int i = 0; i < 40; i++){
            elfo.atirarFlechaEmDwarf(new Dwarf());
        }
        //Assert
        assertEquals(2, elfo.getFlecha().getQuantidade());
        assertEquals(40, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlechaEmDwarf(){
        //Arrange
        Elfo elfo = new Elfo("Caçador de Anões");
        Dwarf anao = new Dwarf();
        //Act
        elfo.atirarFlechaEmDwarf(anao);
        //Assert
        assertEquals(100, anao.getVida());
        assertEquals(41, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoToString(){
        Elfo abraan = new Elfo("Abraan");
        assertEquals("Abraan possui 42 flechas e 0 níveis de experiência.", abraan.toString());
    }
    
    @Test
    public void elfoToStringDepoisDeAtirarFlecha(){
        Elfo goku = new Elfo("Goku");
        Dwarf kuririn = new Dwarf();
        goku.atirarFlechaEmDwarf(kuririn);
        assertEquals("Goku possui 41 flechas e 1 níveis de experiência.", goku.toString());
    }
    
    @Test
    public void elfoToStringDepoisDeAtirar10Flechas(){
        Elfo goku = new Elfo("Goku");
        Dwarf kuririn = new Dwarf();
        for(int i = 0; i < 10; i++){
            goku.atirarFlechaEmDwarf(kuririn);
        }
        assertEquals("Goku possui 32 flechas e 10 níveis de experiência.", goku.toString());
    }
}
