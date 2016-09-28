public class CestoDeLembas{
    //ATRIBUTOS
    private int quantidade;

    //CONSTRUTOR
    public CestoDeLembas(int quantidade){
        this.quantidade = quantidade;
    }

    //METODOS
    public boolean podeDividirEmPares(){
        return quantidade >= 4 && quantidade <= 100 && quantidade % 2 == 0;
    }
    
    //GETTERS AND SETTERS
    public int getQuantidade(){
        return quantidade;
    }
}
