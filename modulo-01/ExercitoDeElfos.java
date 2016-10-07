import java.util.*;
public class ExercitoDeElfos implements Exercito, Estrategias{
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
   
   public List<Elfo> getOrdemDeAtaque(){
       List<Elfo> elfosEmOrdemDeAtaque = new ArrayList<Elfo>();
       for(int i = 0; i < 2; i++){
           for(Elfo elfo : elfosAlistados){
               boolean[] verificacaoClasses = {elfo instanceof ElfoVerde, elfo instanceof ElfoNoturno};
               if(elfo.getStatus() == Status.VIVO && verificacaoClasses[i]){
                   elfosEmOrdemDeAtaque.add(elfo);  
               }
           }
       }
       return elfosEmOrdemDeAtaque;
   }
   
   public List<Elfo> getSegundaOrdemDeAtaque(){
       return null;
   }
   
   //GETTERS AND SETTERS
   public Elfo[] getContingente(){
       return elfosAlistados.toArray(new Elfo[elfosAlistados.size()]);
   }
}
