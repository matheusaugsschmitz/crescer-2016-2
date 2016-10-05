import java.util.*;
/**
 * Classe abstrata ExercitoDeElfos - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public class ExercitoDeElfos{
   //ATRIBUTOS
   private ArrayList<Elfo> elfosAlistados = new ArrayList<Elfo>();
   
   //MÉTODOS
   public void alistarElfo(Elfo elfo){
       ElfoNoturno en = new ElfoNoturno("j");
       ElfoVerde ev = new ElfoVerde("j");
       if(elfo.getClass() == en.getClass() || elfo.getClass() == ev.getClass()){
           elfosAlistados.add(elfo);
       }
   }
   
   public Elfo buscarPorNome(String nome){
       Elfo elfoEncontrado = null;
       for(Elfo elfo : elfosAlistados){
           if(nome.equals(elfo.getNome())){
               elfoEncontrado = elfo;
               break;
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
   
   //GETTERS AND SETTERS
   public ArrayList<Elfo> getElfosAlistados(){
       return elfosAlistados;
   }
}
