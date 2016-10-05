import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoVerdeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoVerdeTest{
    
    @Test
    public void elfoNasceComNome(){
        //Arrange
        String nomeEsperado = "Bruce Wayne";
        //Act
        ElfoVerde elfo = new ElfoVerde(nomeEsperado);
        //Assert
        assertEquals(nomeEsperado, elfo.getNome());
    }
    
    @Test
    public void elfoNasceComArco(){
        //Arrange
        //Act
        ElfoVerde elfo = new ElfoVerde("Shazam");
        //Assert
        assertEquals("Arco", elfo.getArco().getDescricao());
        assertEquals(1, elfo.getArco().getQuantidade());
    }
    
    @Test
    public void elfoNasceCom42Flechas(){
        //Arrange
        //Act
        ElfoVerde elfo = new ElfoVerde("Batman");
        //Assert
        assertEquals("Flecha", elfo.getFlecha().getDescricao());
        assertEquals(42, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNasceSemExp(){
        //Arrange
        //Act
        ElfoVerde elfo = new ElfoVerde("Cleber");
        //Assert
        assertEquals(0, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlecha(){
        //Arrange
        ElfoVerde elfo = new ElfoVerde("Robin Wood");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        //Act
        elfo.atirarFlechaEmDwarf(new Dwarf("Tyrion", data));
        //Assert
        assertEquals(41, elfo.getFlecha().getQuantidade());
        assertEquals(2, elfo.getExp());
    }
    
    @Test
    public void elfoAtira40Flechas(){
        //Arrange
        ElfoVerde elfo = new ElfoVerde("Judas");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        //Act
        for(int i = 0; i < 40; i++){
            elfo.atirarFlechaEmDwarf(new Dwarf("Tyrion", data));
        }
        //Assert
        assertEquals(2, elfo.getFlecha().getQuantidade());
        assertEquals(80, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlechaEmDwarf(){
        //Arrange
        ElfoVerde elfo = new ElfoVerde("Caçador de Anões");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf anao = new Dwarf("Tyrion", data);
        //Act
        elfo.atirarFlechaEmDwarf(anao);
        //Assert
        assertEquals(100, anao.getVida(), 0);
        assertEquals(41, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoToString(){
        ElfoVerde abraan = new ElfoVerde("Abraan");
        assertEquals("Abraan possui 42 flechas e 0 nível de experiência.", abraan.toString());
    }
    
    @Test
    public void elfoToStringDepoisDeAtirarFlecha(){
        ElfoVerde goku = new ElfoVerde("Goku");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf kuririn = new Dwarf("Tyrion", data);
        goku.atirarFlechaEmDwarf(kuririn);
        assertEquals("Goku possui 41 flechas e 2 níveis de experiência.", goku.toString());
    }
    
    @Test
    public void elfoToStringDepoisDeAtirar10Flechas(){
        ElfoVerde goku = new ElfoVerde("Goku");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);        
        Dwarf kuririn = new Dwarf("Tyrion", data);
        for(int i = 0; i < 10; i++){
            goku.atirarFlechaEmDwarf(kuririn);
        }
        assertEquals("Goku possui 32 flechas e 20 níveis de experiência.", goku.toString());
    }
    
    @Test
    public void construtorComNomeEUmaFlecha(){
        ElfoVerde armando = new ElfoVerde("Armando Uma", 1);
        assertEquals("Armando Uma", armando.getNome());
        assertEquals(1, armando.getFlecha().getQuantidade());
    }
    
    @Test
    public void construtorComNomeE70Flechas(){
        ElfoVerde caio = new ElfoVerde("Caio Rolando da Rocha", 70);
        assertEquals("Caio Rolando da Rocha", caio.getNome());
        assertEquals(70, caio.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNasceCom70FlechasEAtira12EmDwarf(){
        ElfoVerde transformer = new ElfoVerde("Carmen", 70);
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf anao = new Dwarf("Tyrion", data);
        for(int i = 0; i < 15; i++){
            transformer.atirarFlechaEmDwarf(anao);
        }
        assertEquals("Carmen", transformer.getNome());
        assertEquals(55, transformer.getFlecha().getQuantidade());        
    }
    
    @Test
    public void elfoToStringCom70FlechasIniciaisDeposDeFlecharDwarf10Vezes(){
        ElfoVerde japa = new ElfoVerde("Japa Sou", 70);
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf anao = new Dwarf("Tyrion", data);
        for(int i = 0; i < 10; i++){
            japa.atirarFlechaEmDwarf(anao);
        }
        assertEquals("Japa Sou possui 60 flechas e 20 níveis de experiência.", japa.toString());
    }
    
    @Test
    public void elfoNasceVivo(){
        ElfoVerde n = new ElfoVerde("Cobaia");
        assertEquals(Status.VIVO, n.getStatus());
    }
    
    @Test
    public void adicionarItemInvalido(){
        ElfoVerde e = new ElfoVerde("West");
        e.adicionarItem(new Item("Cano", 1));
        assertEquals(2, e.getInventario().getItens().size());
    }
    
    @Test
    public void adicionar3ItensSendo2Validos(){
        ElfoVerde e = new ElfoVerde("West");
        e.adicionarItem(new Item("Espada de aço valiriano", 1));
        e.adicionarItem(new Item("Arco de Vidro", 1));
        e.adicionarItem(new Item("Cano", 1));
        assertEquals(4, e.getInventario().getItens().size());
    }
    
    @Test
    public void adicionar3ItensSendo2ValidosERemovendo1Destes(){
        ElfoVerde e = new ElfoVerde("West");
        e.adicionarItem(new Item("Espada de aço valiriano", 1));
        e.adicionarItem(new Item("Arco e Flecha de Vidro", 1));
        e.adicionarItem(new Item("Cano", 1));
        e.perderItem(new Item("Arco e Flecha de Vidro", 1));
        assertEquals(3, e.getInventario().getItens().size());
    }
    
    @Test
    public void elfoVerdeNasceCom100DeVida(){
        Elfo e = new Elfo("j");
        assertEquals(100, e.getVida(), 0);
    }
}