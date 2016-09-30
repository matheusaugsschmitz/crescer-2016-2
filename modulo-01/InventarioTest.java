

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
        assertEquals(1, inv.itens().size());
        assertEquals("Machado", inv.itens().get(0).getDescricao());
        assertEquals(1, inv.itens().get(0).getQuantidade());
    }
    
    @Test
    public void adiciona7Itens(){
        Inventario inv = new Inventario();
        for(int i = 0; i < 7; i++){
            inv.adicionarItem(new Item("Machado", 1));            
        }
        ArrayList<Item> it = inv.itens();
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
        ArrayList<Item> it = inv.itens();
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
        assertEquals(0, inv.itens().size());
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
        assertEquals(5, inv.itens().size());
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
        assertEquals(6, inv.itens().size());
        for(int i = 0; i < 6; i++){
            assertEquals(itens[i+3], inv.itens().get(i).getDescricao());
            assertEquals(1, inv.itens().get(i).getQuantidade());
        }
    }
}
