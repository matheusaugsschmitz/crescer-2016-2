

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
    public void dwarfSeixasGetNumeroSorteAno2016(){//Dwarf imortal
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016); 
        Dwarf anao = new Dwarf("Seixas", data);
        anao.perderVida();
        anao.perderVida();
        assertEquals(33, anao.getNumeroSorte(), 0);
        assertEquals(0, anao.getExp());
    }
    
    @Test
    public void dwarfPerde100DeVida(){
        Dwarf d = new Dwarf();
        for(int i = 0; i < 10; i++){
            d.perderVida();
        }
        assertEquals(10, d.getVida());
        assertEquals(Status.VIVO, d.getStatus());
    }
    
    @Test
    public void dwarfPerde110DeVida(){
        Dwarf d = new Dwarf();
        for(int i = 0; i < 11; i++){
            d.perderVida();
        }
        assertEquals(0, d.getVida());
        assertEquals(Status.MORTO, d.getStatus());
    }
    
    @Test
    public void dwarfPerde300DeVida(){
        Dwarf d = new Dwarf();
        for(int i = 0; i < 30; i++){
            d.perderVida();
        }
        assertEquals(0, d.getVida());
        assertEquals(Status.MORTO, d.getStatus());
    }
    
    @Test
    public void dwarfNasceVivo(){
        assertEquals(Status.VIVO, new Dwarf().getStatus());
    }
    
    @Test
    public void dwarfNasceComInventarioEAdicionaTrabuco(){
        Dwarf d = new Dwarf();
        d.adicionarItem(new Item("Trabuco", 1));
        assertEquals("Trabuco", d.getInventario().getItens().get(0).getDescricao());
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
    }
    
    @Test
    public void dwarfNasceComInventarioEAdiciona3Armas(){
        Dwarf d = new Dwarf();
        d.adicionarItem(new Item("Trabuco", 1));
        d.adicionarItem(new Item("MBT Law", 12));
        d.adicionarItem(new Item("Fênix", 32));
        assertEquals("Trabuco", d.getInventario().getItens().get(0).getDescricao());
        assertEquals("MBT Law", d.getInventario().getItens().get(1).getDescricao());
        assertEquals("Fênix", d.getInventario().getItens().get(2).getDescricao());
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
        assertEquals(12, d.getInventario().getItens().get(1).getQuantidade());
        assertEquals(32, d.getInventario().getItens().get(2).getQuantidade());
    }
    
    @Test
    public void dwarfMacGyverNasceComInventarioETransformaClipEGomaDeMascarEmBomba(){
        Dwarf d = new Dwarf();
        d.adicionarItem(new Item("Clip de papel", 1));
        d.adicionarItem(new Item("Goma de mascar", 1));
        d.perderItem(new Item("Clip de papel", 1));
        d.perderItem(new Item("Goma de mascar", 1));
        d.adicionarItem(new Item("Bomba Relógio", 1));
        assertEquals("Bomba Relógio", d.getInventario().getItens().get(0).getDescricao());
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
    }
    
    @Test
    public void dwarfLeprechaunTentandoSorteComMachadoEEscudo(){
        Dwarf d = new Dwarf("CJ", new DataTerceiraEra(1, 1, 2016));
        d.perderVida();
        d.perderVida();
        d.adicionarItem(new Item("Machado", 1));
        d.adicionarItem(new Item("Escudo", 1));
        d.tentarSorte();
        assertEquals(1001, d.getInventario().getItens().get(0).getQuantidade());
        assertEquals(1001, d.getInventario().getItens().get(1).getQuantidade());
    }
    
    @Test
    public void dwarfNormalTentandoSorteComMachadoEEscudo(){
        Dwarf d = new Dwarf("CJ", new DataTerceiraEra(1, 1, 1900));
        d.perderVida();
        d.perderVida();
        d.adicionarItem(new Item("Machado", 1));
        d.adicionarItem(new Item("Escudo", 1));
        d.tentarSorte();
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
        assertEquals(1, d.getInventario().getItens().get(1).getQuantidade());
    }
}
