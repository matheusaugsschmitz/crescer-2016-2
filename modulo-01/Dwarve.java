public class Dwarve{
    //ATRIBUTOS
    private int vida;
    
    //CONSTRUTOR
    public Dwarve(){
        vida = 110;
    }
    //METODOS
    public void levaFlechada(){
        if(vida > 10){
            vida -= 10;
        }else{
            vida = 0;
        }    
    }
    
    //GETTERS AND SETTERS
    public int getVida(){
        return vida;
    }
}
