public class Dwarf{
    //ATRIBUTOS
    private int vida = 110;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int exp;
    
    //CONSTRUTOR
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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
                vida -= 10;
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
}
