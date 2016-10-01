import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


/**
 * The test class InventarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InventarioTest
{
    @Test
    public void adicionaItem(){
        Inventario inv = new Inventario();
        Item item1 = new Item("Machado", 1);
        inv.adicionarItem(item1);
        assertEquals(1, inv.getItens().size());
        assertEquals("Machado", inv.getItens().get(0).getDescricao());
        assertEquals(1, inv.getItens().get(0).getQuantidade());
    }
    
    @Test
    public void adiciona7Itens(){
        Inventario inv = new Inventario();
        for(int i = 0; i < 7; i++){
            inv.adicionarItem(new Item("Machado", 1));            
        }
        ArrayList<Item> it = inv.getItens();
        assertEquals(7, it.size());
        for(int i = 0; i < 7; i++){
            assertEquals("Machado", it.get(i).getDescricao());
            assertEquals(1, it.get(i).getQuantidade());
        }
    }
    
    @Test
    public void adiciona82Itens(){
        Inventario inv = new Inventario();
        for(int i = 0; i < 82; i++){
            inv.adicionarItem(new Item("Machado", 1));            
        }
        ArrayList<Item> it = inv.getItens();
        assertEquals(82, it.size());
        for(int i = 0; i < 82; i++){
            assertEquals("Machado", it.get(i).getDescricao());
            assertEquals(1, it.get(i).getQuantidade());
        }
    }
    
    @Test
    public void removeUmItem(){
        Inventario inv = new Inventario();
        Item item1 = new Item("Machado", 1);
        inv.adicionarItem(item1);
        inv.removerItem(item1);
        assertEquals(0, inv.getItens().size());
    }
    
    @Test
    public void remove7ItensIguaisDe12Itens(){
        Inventario inv = new Inventario();
        for(int i = 0; i < 12; i++){
            inv.adicionarItem(new Item("Machado", 1));            
        }
        for(int i = 0; i < 7; i++){
            inv.removerItem(new Item("Machado", 1));            
        }
        assertEquals(5, inv.getItens().size());
    }
    @Test
    public void remove3ItensDiferentesDe9Itens(){
        Inventario inv = new Inventario();
        String[] itens = {"Machado", "Escudo", "Turret", "M1-Abrams", "Barret M107", "Preisteixon", "Jogo da Vida", "Pilulas Vermelhas do Morpheus", "Evo XVIII"};
        for(int i = 0; i < 9; i++){
            inv.adicionarItem(new Item(itens[i], 1));            
        }
        for(int i = 0; i < 3; i++){
            inv.removerItem(new Item(itens[i], 1));            
        }
        assertEquals(6, inv.getItens().size());
        for(int i = 0; i < 6; i++){
            assertEquals(itens[i+3], inv.getItens().get(i).getDescricao());
            assertEquals(1, inv.getItens().get(i).getQuantidade());
        }
    }
    
    @Test
    public void getDescricaoDeUmItem(){
        Inventario inv = new Inventario();
        Item item1 = new Item("Machado", 1);
        inv.adicionarItem(item1);
        assertEquals("Machado", inv.getDescricoesItens());
    }
    
    @Test
    public void getDescricaoDe7Itens(){
        Inventario inv = new Inventario();
        String[] itens = {"Machado", "Escudo", "M1-Abrams", "Barret M107", "Preisteixon", "Jogo da Vida", "Evo XVIII"};
        for(int i = 0; i < 7; i++){
            inv.adicionarItem(new Item(itens[i], 1));            
        }
        assertEquals("Machado,Escudo,M1-Abrams,Barret M107,Preisteixon,Jogo da Vida,Evo XVIII", inv.getDescricoesItens());
    }
    
    @Test
    public void getDescricaoDe82Itens(){
        Inventario inv = new Inventario();
        for(int i = 0; i < 82; i++){
            inv.adicionarItem(new Item("Machado", 1));            
        }
        ArrayList<Item> it = inv.getItens();
        assertEquals(82, it.size());
        String oitentaEDoisMachados = "Machado";
        for(int i = 0; i < 81; i++){
            oitentaEDoisMachados += ",Machado";
        }
        assertEquals(oitentaEDoisMachados, inv.getDescricoesItens());
    }
    
    @Test
    public void itemMaisPopularDe7Itens(){
        Inventario inv = new Inventario();
        String[] itens = {"Machado", "Escudo", "M1-Abrams", "Barret M107", "Preisteixon", "Jogo da Vida", "Evo XVIII"};
        for(int i = 0; i < 7; i++){
            inv.adicionarItem(new Item(itens[i], i+10));            
        }
        assertEquals("Evo XVIII", inv.itemMaisPopular().getDescricao());
        assertEquals(16, inv.itemMaisPopular().getQuantidade());
    }
    
    @Test
    public void ordenar3Itens(){
        Inventario inv = new Inventario();
        inv.adicionarItem(new Item("Groot", 17));
        inv.adicionarItem(new Item("Espelho", 9));
        inv.adicionarItem(new Item("Machado", 2));
        inv.ordenarItens();
        ArrayList<Item> itensEmOrdem = new ArrayList<>();
        itensEmOrdem.add(new Item("Machado", 2));
        itensEmOrdem.add(new Item("Espelho", 9));
        itensEmOrdem.add(new Item("Groot", 17));
        assertEquals(itensEmOrdem.get(0).getQuantidade(), inv.getItens().get(0).getQuantidade());
        assertEquals(itensEmOrdem.get(1).getQuantidade(), inv.getItens().get(1).getQuantidade());
        assertEquals(itensEmOrdem.get(2).getQuantidade(), inv.getItens().get(2).getQuantidade());
    }
    public void ordenar12ItensComQuantidadesDiferentes(){
        Inventario inv = new Inventario();
        String[] nomeItens = {"Machado", "Escudo", "Pederneira", "Pexera", "Exp Boost I", "Armadilha para Lagosta", "Pipa", "Skill book", "Uno Mile", "Escada", "Parafina", "Jarro"};
        for(int i = nomeItens.length; i > 0; i--){
            inv.adicionarItem(new Item(nomeItens[i], i));
        }
        inv.ordenarItens();
        assertEquals("Machado,Escudo,Pederneira,Pexera,Exp Boost I,Armadilha para Lagosta,Pipa,Skill book,Uno Mile,Escada,Parafina,Jarro", inv.getDescricoesItens());
    }
}
