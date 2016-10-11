
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste NoturnosPorUltimoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class NoturnosPorUltimoTest{
    @Test
    public void ordenarAtaqueCom2VerdesE1Noturno(){
        NoturnosPorUltimo n = new NoturnosPorUltimo();
        List<Elfo> elfos = new ArrayList<Elfo>();
        Elfo e3 = new ElfoNoturno("j");
        Elfo e1 = new ElfoVerde("j");
        Elfo e2 = new ElfoVerde("j");
        elfos.add(e3);
        elfos.add(e1);
        elfos.add(e2);
        List<Elfo> novaOrdem = n.getOrdemDeAtaque(elfos);
        assertEquals(e1, novaOrdem.get(1));
        assertEquals(e2, novaOrdem.get(0));
        assertEquals(e3, novaOrdem.get(2));
    }
    
    @Test
    public void ordenarAtaqueCom2VerdesE1NoturnoVivosE2NoturnosMortos(){
        NoturnosPorUltimo n = new NoturnosPorUltimo();
        List<Elfo> elfos = new ArrayList<Elfo>();
        Elfo e3 = new ElfoNoturno("j");
        Elfo e4 = new ElfoNoturno("j", 90);
        Elfo e5 = new ElfoNoturno("j", 90);
        Elfo e1 = new ElfoVerde("j");
        Elfo e2 = new ElfoVerde("j");
        elfos.add(e3);
        elfos.add(e1);
        elfos.add(e4);
        elfos.add(e2);
        elfos.add(e5);
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016);
        Dwarf anao = new Dwarf("Seixas", data);
        
        for(int i = 0; i < 90; i++){
            e4.atirarFlechaEmDwarf(anao);
            e5.atirarFlechaEmDwarf(anao);
        }
        List<Elfo> novaOrdem = n.getOrdemDeAtaque(elfos);
        assertEquals(e1, novaOrdem.get(1));
        assertEquals(e2, novaOrdem.get(0));
        assertEquals(e3, novaOrdem.get(2));
        assertEquals(3, novaOrdem.size());
    }
    
    @Test
    public void ordenarAtaqueCom2VerdesE2NoturnoVivosE2NoturnosMortos(){
        NoturnosPorUltimo n = new NoturnosPorUltimo();
        List<Elfo> elfos = new ArrayList<Elfo>();
        Elfo e3 = new ElfoNoturno("j");
        Elfo e6 = new ElfoNoturno("j");
        Elfo e4 = new ElfoNoturno("j", 90);
        Elfo e5 = new ElfoNoturno("j", 90);
        Elfo e1 = new ElfoVerde("j");
        Elfo e2 = new ElfoVerde("j");
        elfos.add(e3);
        elfos.add(e1);
        elfos.add(e4);
        elfos.add(e2);
        elfos.add(e5);
        elfos.add(e6);
        DataTerceiraEra data = new DataTerceiraEra(1, 9, 2016);
        Dwarf anao = new Dwarf("Seixas", data);
        
        for(int i = 0; i < 90; i++){
            e4.atirarFlechaEmDwarf(anao);
            e5.atirarFlechaEmDwarf(anao);
        }
        List<Elfo> novaOrdem = n.getOrdemDeAtaque(elfos);
        assertEquals(e1, novaOrdem.get(1));
        assertEquals(e2, novaOrdem.get(0));
        assertEquals(e3, novaOrdem.get(2));
        assertEquals(e6, novaOrdem.get(3));
        assertEquals(4, novaOrdem.size());
    }
}
