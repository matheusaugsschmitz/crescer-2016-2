package br.com.cwi.crescer.lista2exercicios;

import br.com.cwi.crescer.listasexercicios.MeuStringUtil;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matha
 */
public class MeuFileUtils {
    private String caminhoCriacao;
    public static void main(String[] args) {
        try ( final Scanner scanner = new Scanner(System.in) ) {
            System.out.println("Insira um comando!");
            String linhaComando = scanner.nextLine().replaceAll("\\\\","/");
            String parteComando[] = linhaComando.split(" ");
            String sintaxeSimples = "'%s [caminho]/[arquivo]' ou '%s [arquivo]'";
            MeuFileUtils fileUtils = new MeuFileUtils();
            switch(parteComando[0]){
                case "mk":
                    if(parteComando.length == 2){
                        fileUtils.mk(parteComando[1]);
                    }else{
                        fileUtils.exibeErroSintaxe(String.format(sintaxeSimples, "mk"));
                    }
                    break;
                case "rm":
                    if(parteComando.length == 2){
                        fileUtils.rm(parteComando[1]);
                    }else{
                        fileUtils.exibeErroSintaxe(String.format(sintaxeSimples, "rm"));
                    }
                    break;
                case "ls":
                    if(parteComando.length == 2){
                        fileUtils.ls(parteComando[1]);
                    }else{
                        fileUtils.exibeErroSintaxe(String.format(sintaxeSimples, "ls"));
                    }
                    break;
                case "mv":
                    if(parteComando.length == 3){
                        fileUtils.mv(parteComando);
                    }else{
                        fileUtils.exibeErroSintaxe("'mv [caminho]/[arquivo] [caminhoAlvo]/[arquivoNovo]' ou 'mv [arquivo] [arquivoNovo]'");
                    }
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler/executar o comando!");
        }
    }
    public void mk(String novo){
        this.caminhoCriacao = "";
        int partesComFormato = 0;
        List<String> partesCaminho = Arrays.asList(novo.split("/"));
        if(partesCaminho.size() > 1){
            partesComFormato = partesCaminho.stream().map((parteCaminho) -> parteCaminho.contains(".") ? 1 : 0).reduce(partesComFormato, Integer::sum);
            if(partesComFormato <= 1){
                this.caminhoCriacao = new StringBuffer(partesCaminho.get(0)).append("/").toString();
                partesCaminho.forEach((string) -> {
                    this.criar(string);
                });
            }else{
                System.out.println("Caminho informado inválido!");
            }
        }else{
            criar(partesCaminho.get(0));
        }
    }
    private void criar(String novo){
        try {
            String caminhoCriacao = this.caminhoCriacao;
            if(!novo.concat("/").equals(caminhoCriacao)){
                System.out.println(new StringBuffer(caminhoCriacao).append(novo).toString());
                File file = new File(new StringBuffer(caminhoCriacao).append(novo).toString());
                if(novo.contains(".")){
                    file.createNewFile();
                }else{
                    file.mkdir();
                }
                this.caminhoCriacao = new StringBuffer(caminhoCriacao).append(novo).append("/").toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void rm(String caminhoArquivo){
        try{
            String[] caminhoParticionado = caminhoArquivo.split("/");
            if(caminhoParticionado[caminhoParticionado.length-1].contains(".")){
                final boolean b = new File(caminhoArquivo).delete();
            }else{
                System.out.println("Arquivo inválido!");
            }
        }catch(Exception e){
            System.out.println("Erro ao remover o arquivo!");
        }
    }
    public void ls(String caminho){
        try{
            String[] caminhoParticionado = caminho.split("/");
            File file = new File(caminho);
            if(caminhoParticionado[caminhoParticionado.length-1].contains(".")){
                System.out.println(file.getAbsolutePath());
            }else{
                Arrays.asList(file.
                    listFiles(f -> f.isFile())
                ).forEach((f) -> {System.out.println(f.getName());});
            }
        }catch(Exception e){
            System.out.println("Erro ao encontrar caminho!");
        }
    }
    public void mv(String parteComando[]){
        if(parteComando[1].contains(".")){
            int posicaoUltimaBarra = parteComando[2].length() - new MeuStringUtil().inverteString(parteComando[2]).indexOf("/");
            String caminhoDietorio = parteComando[2].substring(0, posicaoUltimaBarra - 1);
            File diretorioDestino = new File(caminhoDietorio);
            File arquivoOrigem = new File(parteComando[1]);
            if (!diretorioDestino.exists()) {
                this.criar(caminhoDietorio);
            } 
            String novoNome = parteComando[2].contains(".") ? parteComando[2].substring(posicaoUltimaBarra, parteComando[2].length()) : arquivoOrigem.getName();
            arquivoOrigem.renameTo(new File(diretorioDestino, novoNome));
        }else{
            System.out.println("Arquivo inválido!");
        }
    }
    private void exibeErroSintaxe(String sintaxe){
        System.out.format("Erro de sintaxe. Sintaxe correta: %s", sintaxe);
    }
}
