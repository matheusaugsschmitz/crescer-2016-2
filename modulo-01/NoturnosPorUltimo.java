import java.util.*;
public class NoturnosPorUltimo implements Estrategia{
   public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
      List<Elfo> elfosEmOrdemDeAtaque = new ArrayList<Elfo>(atacantes.size());
      for(int i = 0; i < atacantes.size(); i++){
          Elfo elfo = atacantes.get(i);
          if(elfo.getStatus() == Status.VIVO){
              if(elfo instanceof ElfoVerde){
                  elfosEmOrdemDeAtaque.add(0, elfo);
              }else{
                  elfosEmOrdemDeAtaque.add(elfo);
              }
          }
      }
      return elfosEmOrdemDeAtaque;
   }
}
