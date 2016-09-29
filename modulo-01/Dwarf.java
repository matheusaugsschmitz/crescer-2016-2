public class Dwarf{
    //ATRIBUTOS
    private int vida = 110;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int exp;
    private Status status;
    
    //CONSTRUTOR
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
    }  
    
    public Dwarf(){
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    //METODOS
    public void perderVida(){
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
}
