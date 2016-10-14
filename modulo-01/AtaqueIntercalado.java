import java.util.*;
public class AtaqueIntercalado implements Estrategia{
    List<Elfo> atacantes;
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes) throws ContingenteDesproporcionalException{
      NoturnosPorUltimo n = new NoturnosPorUltimo();
      this.atacantes = n.getOrdemDeAtaque(atacantes);
      List<Elfo> elfosEmOrdemDeAtaque = new ArrayList<Elfo>(atacantes.size());
      
      if(!verificaEquilibrio()){
          throw new ContingenteDesproporcionalException();
      }
       
      while(!this.atacantes.isEmpty()){
         elfosEmOrdemDeAtaque.add(this.atacantes.get(0));
         this.atacantes.remove(0);
         elfosEmOrdemDeAtaque.add(this.atacantes.get(this.atacantes.size() - 1));  
         this.atacantes.remove(this.atacantes.size() - 1);
      }
      return elfosEmOrdemDeAtaque;
   }
   
   private boolean verificaEquilibrio(){
       int elfosVerdes = 0, elfosNoturnos = 0;
       for(Elfo elfo : atacantes){
          if(elfo instanceof ElfoVerde){
              elfosVerdes++;
          }else{
              elfosNoturnos++; 
          }
       }
       return elfosVerdes == elfosNoturnos;
   }
}
