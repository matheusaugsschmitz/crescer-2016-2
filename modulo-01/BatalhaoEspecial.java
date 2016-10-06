import java.util.HashMap;
/**
 * Escreva a descrição da classe BatalhaoEspecial aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class BatalhaoEspecial{
    //ATRIBUTOS
   private HashMap<String, Elfo> elfosAlistados = new HashMap<>();
   
   //MÉTODOS
   public void alistarElfo(Elfo elfo){
       boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
       if(podeAlistar){
           elfosAlistados.put(elfo.getNome(), elfo);
       }
   }
   
   public Elfo buscarPorNome(String nome){
       return elfosAlistados.get(nome);
   }
   
   public HashMap<String, Elfo> buscar(Status status){
       HashMap<String, Elfo> elfos = new HashMap<>();
       for(Elfo elfo : elfosAlistados.values()){
           if(elfo.getStatus() == status){
               elfos.put(elfo.getNome(), elfo);
           }
       }
       return elfos;
   }
   
   //GETTERS AND SETTERS
   public Elfo[] getElfosAlistados(){
       return elfosAlistados.values().toArray(new Elfo[elfosAlistados.size()]);
   }
}
