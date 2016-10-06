import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IrishDwarfTest{
    @Test
    public void vidaIrishDwarfAoNascer(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016);        
        //Act
        IrishDwarf anao = new IrishDwarf("Smiggle", data);
        //Assert
        assertEquals(110, anao.getVida(), 0);
    }
    
    @Test
    public void IrishDwarfLevandoFlechada(){
        //Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016); 
        IrishDwarf anao = new IrishDwarf("Smiggle", data);
        //Act
        anao.perderVida();
        //Assert
        assertEquals(100, anao.getVida(), 0);
    }
    
    @Test
    public void IrishDwarfRecebeNomeEDataNascimento(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016); 
        IrishDwarf anao = new IrishDwarf("Smiggle", data);
        assertEquals("Smiggle", anao.getNome());
        assertEquals(1, anao.getDataNascimento().getDia());
        assertEquals(9, anao.getDataNascimento().getMes());
        assertEquals(3016, anao.getDataNascimento().getAno());
    }
    
    @Test
    public void IrishDwarfSemNomeRecebeDataNascimento(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3016); 
        IrishDwarf anao = new IrishDwarf("", data);
        assertEquals("", anao.getNome());
        assertEquals(1, anao.getDataNascimento().getDia());
        assertEquals(9, anao.getDataNascimento().getMes());
        assertEquals(3016, anao.getDataNascimento().getAno());
    }
    
    @Test
    public void IrishDwarfGetNumeroSorteAno2016(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016); 
        IrishDwarf anao = new IrishDwarf("Smiggle", data);
        assertEquals(101.0, anao.getNumeroSorte(), 0);
    }
    
    @Test
    public void IrishDwarfGetNumeroSorteAno3079(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3079); 
        IrishDwarf anao = new IrishDwarf("Smiggle", data);
        assertEquals(101.0, anao.getNumeroSorte(), 0);
    }
    
    @Test
    public void IrishDwarfSeixasGetNumeroSorteAno3079(){
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 3079); 
        IrishDwarf anao = new IrishDwarf("Seixas", data);
        assertEquals(33.0, anao.getNumeroSorte(), 0);
    }
    
    @Test
    public void IrishDwarfSeixasGetNumeroSorteAno2016(){//IrishDwarf imortal
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016); 
        IrishDwarf anao = new IrishDwarf("Seixas", data);
        anao.perderVida();
        anao.perderVida();
        assertEquals(33, anao.getNumeroSorte(), 0);
        assertEquals(0, anao.getExp());
    }
    
    @Test
    public void IrishDwarfPerde100DeVida(){
        IrishDwarf d = new IrishDwarf();
        for(int i = 0; i < 10; i++){
            d.perderVida();
        }
        assertEquals(10, d.getVida(), 0);
        assertEquals(Status.VIVO, d.getStatus());
    }
    
    @Test
    public void IrishDwarfPerde110DeVida(){
        IrishDwarf d = new IrishDwarf();
        for(int i = 0; i < 11; i++){
            d.perderVida();
        }
        assertEquals(0, d.getVida(), 0);
        assertEquals(Status.MORTO, d.getStatus());
    }
    
    @Test
    public void IrishDwarfPerde300DeVida(){
        IrishDwarf d = new IrishDwarf();
        for(int i = 0; i < 30; i++){
            d.perderVida();
        }
        assertEquals(0, d.getVida(), 0);
        assertEquals(Status.MORTO, d.getStatus());
    }
    
    @Test
    public void IrishDwarfNasceVivo(){
        assertEquals(Status.VIVO, new IrishDwarf().getStatus());
    }
    
    @Test
    public void IrishDwarfNasceComInventarioEAdicionaTrabuco(){
        IrishDwarf d = new IrishDwarf();
        d.adicionarItem(new Item("Trabuco", 1));
        assertEquals("Trabuco", d.getInventario().getItens().get(0).getDescricao());
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
    }
    
    @Test
    public void IrishDwarfNasceComInventarioEAdiciona3Armas(){
        IrishDwarf d = new IrishDwarf();
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
    public void IrishDwarfMacGyverNasceComInventarioETransformaClipEGomaDeMascarEmBomba(){
        IrishDwarf d = new IrishDwarf();
        d.adicionarItem(new Item("Clip de papel", 1));
        d.adicionarItem(new Item("Goma de mascar", 1));
        d.perderItem(new Item("Clip de papel", 1));
        d.perderItem(new Item("Goma de mascar", 1));
        d.adicionarItem(new Item("Bomba Relógio", 1));
        assertEquals("Bomba Relógio", d.getInventario().getItens().get(0).getDescricao());
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
    }
    
    @Test
    public void IrishDwarfLeprechaunTentandoSorteComMachadoEEscudo(){
        IrishDwarf d = new IrishDwarf("CJ", new DataTerceiraEra(1, 1, 2016));
        d.perderVida();
        d.perderVida();
        d.adicionarItem(new Item("Machado", 1));
        d.adicionarItem(new Item("Escudo", 1));
        d.tentarSorte();
        assertEquals(1001, d.getInventario().getItens().get(0).getQuantidade());
        assertEquals(1001, d.getInventario().getItens().get(1).getQuantidade());
    }
    
    @Test
    public void IrishDwarfNormalTentandoSorteComMachadoEEscudo(){
        IrishDwarf d = new IrishDwarf("CJ", new DataTerceiraEra(1, 1, 1900));
        d.perderVida();
        d.perderVida();
        d.adicionarItem(new Item("Machado", 1));
        d.adicionarItem(new Item("Escudo", 1));
        d.tentarSorte();
        assertEquals(1, d.getInventario().getItens().get(0).getQuantidade());
        assertEquals(1, d.getInventario().getItens().get(1).getQuantidade());
    }
    
    @Test
    public void irishDwarfComSorte() {
        IrishDwarf dwarf = new IrishDwarf("Pete 'O Murphy", new DataTerceiraEra(1, 1, 2000));
        dwarf.adicionarItem(new Item("Pint de Guinness", 5));
        dwarf.perderVida();
        dwarf.perderVida();
        dwarf.perderVida();
        dwarf.tentarSorte();
        assertEquals(15005, dwarf.getInventario().getItens().get(0).getQuantidade());
    }
    
    @Test
    public void irishDwarfQuantidadeNegativaComSorte() {
        IrishDwarf dwarf = new IrishDwarf("Pete 'O Murphy", new DataTerceiraEra(1, 1, 2000));
        dwarf.adicionarItem(new Item("Pint de Guinness", -5));
        dwarf.perderVida();
        dwarf.perderVida();
        dwarf.perderVida();
        dwarf.tentarSorte();
        assertEquals(14995, dwarf.getInventario().getItens().get(0).getQuantidade());
    }
}
