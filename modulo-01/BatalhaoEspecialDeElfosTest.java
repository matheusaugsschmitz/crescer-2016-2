import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BatalhaoEspecialDeElfosTest{
    @After
    public void tearDown(){
        System.gc();//garbageCollector
    }
    
    @Test
    public void criarExercitoComElfoVerde(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        Elfo elfoVerde = new ElfoVerde("EV");
        e.alistar(elfoVerde);
        assertEquals(elfoVerde, e.getContingente()[0]);
    }
    
    @Test
    public void criarExercitoComElfoNoturno(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        Elfo elfoNoturno = new ElfoNoturno("EN");
        e.alistar(elfoNoturno);
        assertEquals(elfoNoturno, e.getContingente()[0]);
    }
    
    @Test
    public void criarExercitoComElfo(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        Elfo elfo = new Elfo("EN");
        e.alistar(elfo);
        assertEquals(0, e.getContingente().length);
    }
    
    @Test
    public void criarExercitoCom3ElfosNormais(){
        BatalhaoEspecialDeElfos e2 = new BatalhaoEspecialDeElfos();
        e2.alistar(new Elfo("Josias"));
        e2.alistar(new Elfo("Jonas"));
        e2.alistar(new Elfo("Jonas"));
        assertEquals(0, e2.getContingente().length);
    }
    
    @Test
    public void criarExercitoSemElfos(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        assertEquals(0, e.getContingente().length);
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosDiferentes(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        e.alistar(ev);
        e.alistar(new ElfoNoturno("Jonas"));
        assertEquals(ev, e.buscar("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosIguais(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Josias");
        e.alistar(ev);
        e.alistar(en);
        assertEquals(ev, e.buscar("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeSemElfos(){
        BatalhaoEspecialDeElfos e = new BatalhaoEspecialDeElfos();
        assertEquals(null, e.buscar("Josias"));
    }
}
