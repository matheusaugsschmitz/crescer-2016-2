import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoNoturnoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoNoturnoTest{
    
    @Test
    public void elfoNasceComNome(){
        //Arrange
        String nomeEsperado = "Bruce Wayne";
        //Act
        ElfoNoturno elfo = new ElfoNoturno(nomeEsperado);
        //Assert
        assertEquals(nomeEsperado, elfo.getNome());
    }
    
    @Test
    public void elfoNasceComArco(){
        //Arrange
        //Act
        ElfoNoturno elfo = new ElfoNoturno("Shazam");
        //Assert
        assertEquals("Arco", elfo.getArco().getDescricao());
        assertEquals(1, elfo.getArco().getQuantidade());
    }
    
    @Test
    public void elfoNasceCom42Flechas(){
        //Arrange
        //Act
        ElfoNoturno elfo = new ElfoNoturno("Batman");
        //Assert
        assertEquals("Flecha", elfo.getFlecha().getDescricao());
        assertEquals(42, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNasceSemExp(){
        //Arrange
        //Act
        ElfoNoturno elfo = new ElfoNoturno("Cleber");
        //Assert
        assertEquals(0, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlecha(){
        //Arrange
        ElfoNoturno elfo = new ElfoNoturno("Robin Wood");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        //Act
        elfo.atirarFlechaEmDwarf(new Dwarf("Tyrion", data));
        //Assert
        assertEquals(41, elfo.getFlecha().getQuantidade());
        assertEquals(3, elfo.getExp());
    }
    
    @Test
    public void elfoAtira40Flechas(){
        //Arrange
        ElfoNoturno elfo = new ElfoNoturno("Judas");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        //Act
        for(int i = 0; i < 40; i++){
            elfo.atirarFlechaEmDwarf(new Dwarf("Tyrion", data));
        }
        //Assert
        assertEquals(2, elfo.getFlecha().getQuantidade());
        assertEquals(120, elfo.getExp());
    }
    
    @Test
    public void elfoAtiraFlechaEmDwarf(){
        //Arrange
        ElfoNoturno elfo = new ElfoNoturno("Caçador de Anões");
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
        ElfoNoturno abraan = new ElfoNoturno("Abraan");
        assertEquals("Abraan possui 42 flechas e 0 nível de experiência.", abraan.toString());
    }
    
    @Test
    public void elfoToStringDepoisDeAtirarFlecha(){
        ElfoNoturno goku = new ElfoNoturno("Goku");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf kuririn = new Dwarf("Tyrion", data);
        goku.atirarFlechaEmDwarf(kuririn);
        assertEquals("Goku possui 41 flechas e 3 níveis de experiência.", goku.toString());
    }
    
    @Test
    public void elfoToStringDepoisDeAtirar10Flechas(){
        ElfoNoturno goku = new ElfoNoturno("Goku");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);        
        Dwarf kuririn = new Dwarf("Tyrion", data);
        for(int i = 0; i < 10; i++){
            goku.atirarFlechaEmDwarf(kuririn);
        }
        assertEquals("Goku possui 32 flechas e 30 níveis de experiência.", goku.toString());
    }
    
    @Test
    public void construtorComNomeEUmaFlecha(){
        ElfoNoturno armando = new ElfoNoturno("Armando Uma", 1);
        assertEquals("Armando Uma", armando.getNome());
        assertEquals(1, armando.getFlecha().getQuantidade());
    }
    
    @Test
    public void construtorComNomeE70Flechas(){
        ElfoNoturno caio = new ElfoNoturno("Caio Rolando da Rocha", 70);
        assertEquals("Caio Rolando da Rocha", caio.getNome());
        assertEquals(70, caio.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNasceCom70FlechasEAtira12EmDwarf(){
        ElfoNoturno transformer = new ElfoNoturno("Carmen", 70);
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
        ElfoNoturno japa = new ElfoNoturno("Japa Sou", 70);
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf anao = new Dwarf("Tyrion", data);
        for(int i = 0; i < 10; i++){
            japa.atirarFlechaEmDwarf(anao);
        }
        assertEquals("Japa Sou possui 60 flechas e 30 níveis de experiência.", japa.toString());
    }
    
    @Test
    public void elfoNasceVivo(){
        ElfoNoturno n = new ElfoNoturno("Cobaia");
        assertEquals(Status.VIVO, n.getStatus());
    }
    
    @Test
    public void elfoNasceCom100DeVida(){
        ElfoNoturno e = new ElfoNoturno("j");
        assertEquals(100, e.getVida(), 0);
    }
    
    @Test
    public void elfoAtira1FlechaEPerdeVida(){
        ElfoNoturno e = new ElfoNoturno("j");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf anao = new Dwarf("Tyrion", data);
        e.atirarFlechaEmDwarf(anao);
        assertEquals(95, e.getVida(), 0);
    }
    
    @Test
    public void elfoAtira10FlechasEPerdeVida(){
        ElfoNoturno e = new ElfoNoturno("j");
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);
        Dwarf anao = new Dwarf("Tyrion", data);
        for(int i = 0; i < 10; i++){
            e.atirarFlechaEmDwarf(anao);
        }
        assertEquals(59.873693923837890625, e.getVida(), 0.0000000000001);
    }
    
    @Test
    public void elfoAtira90FlechasEMorre(){
        ElfoNoturno e = new ElfoNoturno("j", 90);
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016);
        Dwarf anao = new Dwarf("Seixas", data);
        
        for(int i = 0; i < 90; i++){
            e.atirarFlechaEmDwarf(anao);
        }
        assertEquals(0, (int)e.getVida());
        assertEquals(Status.MORTO, e.getStatus());
    }
}
