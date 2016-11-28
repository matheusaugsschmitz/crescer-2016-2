/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista2exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matha
 */
public class MeuWriterUtils {
    public static void main(String[] args) {
        try ( final Scanner scanner = new Scanner(System.in) ) {
            System.out.println("Insira o caminho de um arquivo!");
            String linhaComando = scanner.nextLine().replaceAll("\\\\","/");
            System.out.println("Insira o texto para adicionar no arquivo!");
            String linhasTexto = scanner.nextLine();
            MeuWriterUtils writerUtils = new MeuWriterUtils();
            writerUtils.escreverConteudo(linhaComando, Arrays.asList(linhasTexto.split("\\\\n")));            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler/executar o comando!");
        }
    }
    /*Crie um metodo que receba o nome do arquivo e o conteudo que ele deve receber (String, List).
    O arquivo tem deve ser apenas do tipo .txt, caso contrário exibir um mensagem que o arquivo solicitado é incompatível.
    Caso não localizei, exibir um mensagem que o mesmo não existe.*/
    
    public void escreverConteudo(String arquivo, List<String> conteudo){
        if(arquivo.contains(".txt") || arquivo.contains(".csv")){
            try (   
                final Writer writer = new FileWriter(arquivo, true);
                final BufferedWriter bufferedWriter = new BufferedWriter(writer);
            ) {
                for (String string : conteudo) {
                    bufferedWriter.newLine();
                    bufferedWriter.append(string); 
                }
                bufferedWriter.flush();
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não incontrado!");
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Arquivo solicitado incompatível!");
        }
    }
}
