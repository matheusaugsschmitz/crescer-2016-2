
/**
 * Escreva a descrição da classe ElfoNoturno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ElfoNoturno extends Elfo{
    public ElfoNoturno(String nome){
        super(nome);
    }
    
    public ElfoNoturno(String n, int quantidade){
        super(n, quantidade);
    }
    
    public void atirarFlechaEmDwarf(Dwarf anao){
        boolean perderVida = getFlecha().getQuantidade() > 0 ? true : false;
        super.atirarFlechaEmDwarf(anao, 3);
        if(perderVida){
            vida *= 0.95;
        }
        if(vida < 1.0){
            status = Status.MORTO;
            vida = 0;
        }
    }
    //5.2
    //Os Elfos Noturnos não podem morrer, pois a vida será reduzida de maneira exponencial sem chegar ao valor 0, no caso, para morrer, ao invés de reduzir 5%, deveria reduzir 100% da vida
}
