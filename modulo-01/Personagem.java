
/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem{
    protected String nome;
    protected int exp;
    protected Status status;
    protected Inventario inventario;
    
    //CONSTRUTOR
    public Personagem(String nome){
        this.nome = nome;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
    }
    
    //METODOS
    public void adicionarItem(Item item){
        inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        inventario.removerItem(item);
    }
    
    //GETTERS AND SETTERS
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public int getExp(){
        return exp;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public Inventario getInventario(){
        return inventario;
    }
}