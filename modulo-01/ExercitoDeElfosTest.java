import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExercitoDeElfosTest{
    @After
    public void tearDown(){
        System.gc();//garbageCollector
    }
    
    @Test
    public void criarExercitoComElfoVerde(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo elfoVerde = new ElfoVerde("EV");
        e.alistar(elfoVerde);
        assertEquals(elfoVerde, e.getContingente()[0]);
    }
    
    @Test
    public void criarExercitoComElfoNoturno(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo elfoNoturno = new ElfoNoturno("EN");
        e.alistar(elfoNoturno);
        assertEquals(elfoNoturno, e.getContingente()[0]);
    }
    
    @Test
    public void criarExercitoComElfo(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo elfo = new Elfo("EN");
        e.alistar(elfo);
        assertEquals(0, e.getContingente().length);
    }
    
    @Test
    public void criarExercitoCom1ElfoVerdeE1ElfoNoturno(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        e.alistar(new ElfoVerde("Josias"));
        e.alistar(new ElfoNoturno("Jonas"));
        assertEquals(2, e.getContingente().length);
    }
    
    @Test
    public void criarExercitoCom3ElfosNormais(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        e.alistar(new Elfo("Josias"));
        e.alistar(new Elfo("Jonas"));
        e.alistar(new Elfo("Jonas"));
        assertEquals(0, e.getContingente().length);
    }
    
    @Test
    public void criarExercitoSemElfos(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        assertEquals(0, e.getContingente().length);
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosDiferentes(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        e.alistar(ev);
        e.alistar(new ElfoNoturno("Jonas"));
        assertEquals(ev, e.buscar("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeCom2ElfosIguais(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Josias");
        e.alistar(ev);
        e.alistar(en);
        assertEquals(ev, e.buscar("Josias"));
    }
    
    @Test
    public void buscarElfoPorNomeSemElfos(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        assertEquals(null, e.buscar("Josias"));
    }
    
    @Test
    public void buscarElfosPorStatusComDoisElfosVivos(){
        ExercitoDeElfos e = new ExercitoDeElfos();
        Elfo ev = new ElfoVerde("Josias");
        Elfo en = new ElfoNoturno("Josias");
        e.alistar(ev);
        e.alistar(en);
        ArrayList<Elfo> resultado = e.buscar(Status.VIVO);
        assertEquals(2, resultado.size());
    }
}
