import java.util.ArrayList;
public class Dwarf extends Personagem{
    //ATRIBUTOS
    protected DataTerceiraEra dataNascimento;
    
    //CONSTRUTOR
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome);
        vida = 110;
        this.dataNascimento = dataNascimento;
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
    
    //GETTERS AND SETTERS
    
    public DataTerceiraEra getDataNascimento(){
        return dataNascimento;
    }
}
