import java.util.*;
public class BatalhaoEspecialDeElfos implements Exercito{
    //ATRIBUTOS
   private HashMap<String, ArrayList<Elfo>> contingente = new HashMap<>();
   private HashMap<Status, ArrayList<Elfo>> grupoPorStatus = new HashMap<>();
   
   //MÉTODOS
   public void alistar(Elfo elfo) {
       boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
       if (podeAlistar) {
           ArrayList<Elfo> elfosComEsteNome = contingente.get(elfo.getNome());
           boolean aindaNaoTemElfoComEsteNome = elfosComEsteNome == null;
           if (aindaNaoTemElfoComEsteNome) {
               elfosComEsteNome = new ArrayList<>();
               contingente.put(elfo.getNome(), elfosComEsteNome);
           }
           elfosComEsteNome.add(elfo);
       }
   }
   
   public Elfo buscar(String nome){
       return contingente.containsKey(nome) ? contingente.get(nome).get(0) : null;
   }
   
   public void agruparPorStatus() {
        grupoPorStatus.clear();
        for (Map.Entry<String, ArrayList<Elfo>> par : contingente.entrySet()) {
            for (Elfo elfo : par.getValue()) {
                Status status = elfo.getStatus();
                ArrayList<Elfo> elfosDoStatus = grupoPorStatus.get(status);
                boolean aindaNaoAgrupeiPorEsteStatus = elfosDoStatus == null;
                if (aindaNaoAgrupeiPorEsteStatus) {
                    elfosDoStatus = new ArrayList<>();
                    grupoPorStatus.put(status, elfosDoStatus);
                }
                elfosDoStatus.add(elfo);
            }
        }
    }
   
   public ArrayList<Elfo> buscar(Status status) {
        agruparPorStatus();
        return grupoPorStatus.get(status);
   }
   
   //GETTERS AND SETTERS
   public Elfo[] getContingente(){
       ArrayList<Elfo> resultado = new ArrayList<>();
       for(ArrayList<Elfo> listas : contingente.values()){
           resultado.addAll(listas);
       }
       return resultado.toArray(new Elfo[resultado.size()]);
   }
}
