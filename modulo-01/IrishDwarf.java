import java.util.ArrayList;

public class IrishDwarf extends Dwarf{
    public IrishDwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome, dataNascimento);
    }  
    
    public IrishDwarf(){
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    public void tentarSorte(){
        if(getNumeroSorte() == -3333.0){
            inventario.aumentarSomatorialUnidadesDosItens();
        }
    }
}
