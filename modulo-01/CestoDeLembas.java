public class CestoDeLembas{
    //ATRIBUTOS
    private int quantidade;

    //CONSTRUTOR
    public CestoDeLembas(int quantidade){
        this.quantidade = quantidade;
    }

    //METODOS
    public boolean cestoDivisivel(){
        if(quantidade >= 4 && quantidade <= 100 && quantidade % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    //GETTERS AND SETTERS
    public int getQuantidade(){
        return quantidade;
    }
}
