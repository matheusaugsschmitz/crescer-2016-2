package br.com.cwi.crecer.aula1;

/**
 *
 * @author matheus.schmitz
 */
/*Usando o enum descrito abaixo, utilize o StringBuffer para concatenar os 
nomes do estados separados por virgula, e exiba-os na console. Se conseguir ordenado melhor.*/
enum Estados {
    AC("Acre"), AL("Alagoas"), ES("EspíritoSanto"), AP("Amapá"),
    BA("Bahia"), CE("Ceará"), DF("DistritoFederal"), GO("Goiás"),
    MA("Maranhão"), SC("SantaCatarina"), MG("MinasGerais"),
    MT("MatoGrosso"), MS("MatoGrossodoSul"), PA("Pará"),
    RS("RioGrandedoSul"), PE("Pernambuco"), PI("Piauí"),
    AM("Amazonas"), PR("Paraná"), RJ("RiodeJaneiro"),
    RN("RioGrandedoNorte"), PB("Paraíba"), RO("Rondônia"),
    RR("Roraima"), SE("Sergipe"), SP("SãoPaulo"), TO("Tocantins");

    private String nome;

    private static StringBuffer Concatenar(){
        StringBuffer nomesEstados = new StringBuffer();      
        for(Estados estado : Estados.values()){
            nomesEstados.append(estado.nome);
            if(!estado.nome.equals("Tocantins")){
                nomesEstados.append(",");
            }
        }
        return nomesEstados;
    }
    private Estados(String nome) {
        this.nome = nome;
    }

    public static String getNome() {
        return Concatenar().toString();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
