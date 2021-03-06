import java.util.*;
public class ExercitoDeElfos implements Exercito{
   //ATRIBUTOS
   private ArrayList<Elfo> elfosAlistados = new ArrayList<Elfo>();
   
   //MÉTODOS
   public void alistar(Elfo elfo){
       boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
       if(podeAlistar){
           elfosAlistados.add(elfo);
       }
   }
   
   public Elfo buscar(String nome){
       for(Elfo elfo : elfosAlistados){
           if(nome.equals(elfo.getNome())){
               return elfo;
           }
       }
       return null;
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
   public Elfo[] getContingente(){
       return elfosAlistados.toArray(new Elfo[elfosAlistados.size()]);
   }
}
