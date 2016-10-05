import java.util.*;
/**
 * Classe abstrata ExercitoDeElfos - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class ExercitoDeElfos{
   //ATRIBUTOS
   private ArrayList<Elfo> elfosAlistados = new ArrayList<Elfo>();
   
   //MÉTODOS
   public void adicionarElfo(Elfo elfo){
       if(elfo.getClass().equals("ElfoVerde") || elfo.getClass().equals("ElfoNoturno")){
           elfosAlistados.add(elfo);
       }
   }
   
   public Elfo buscarPorNome(String nome){
       Elfo elfoEncontrado = null;
       for(Elfo elfo : elfosAlistados){
           if(nome.equals(elfo.getNome())){
               elfoEncontrado = elfo;
           }
       }
       return elfoEncontrado;
   }
   
   public ArrayList<Elfo> buscar(Status status){
       ArrayList<Elfo> elfos = new ArrayList<>();
       for(Elfo elfo : elfosAlistados){
           if(elfo.getStatus() == status){
               elfos.add(elfo);
           }
       }
       return elfos;
   }
}
