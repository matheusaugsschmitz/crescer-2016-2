import java.util.ArrayList;
public class Dwarf{
    //ATRIBUTOS
    protected int vida = 110;
    protected DataTerceiraEra dataNascimento;
    protected String nome;
    protected int exp;
    protected Status status;
    protected Inventario inventario;
    
    //CONSTRUTOR
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
    }  
    
    public Dwarf(){
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    //METODOS
    public void perderVida(){
        boolean estaMorto = status.equals(Status.MORTO);
        if(estaMorto){
            return;
        }
        
        double numero = getNumeroSorte();
        if(numero < 0){
            exp += 2;
        }else{
            if(numero > 100){
                if(vida > 10){
                    vida -= 10;
                }else{ 
                    vida = 0;
                    status = Status.MORTO;
                }
            }
        }
    }
    
    public double getNumeroSorte(){
        double numero = 101.0;
        if(dataNascimento.ehBissexto() && vida <= 90 && vida >= 80){
            numero *= -33;
        }else{
            if("Seixas".equals(nome) || "Meireles".equals(nome)){
                numero = (numero*33)%100;
            }
        }
        return numero;
    }
    
    public void tentarSorte(){
        if(getNumeroSorte() == -3333.0){
            inventario.aumentarUnidadesDosItens(1000);
        }
    }
    
    public void adicionarItem(Item item){
        inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        inventario.removerItem(item);
    }
    
    //GETTERS AND SETTERS
    public int getVida(){
        return vida;
    }
    
    public String getNome(){
        return nome;
    }
    
    public DataTerceiraEra getDataNascimento(){
        return dataNascimento;
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
