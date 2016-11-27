/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista2exercicios;

import br.com.cwi.crescer.listasexercicios.MeuStringUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author matha
 */
public class MeuReaderUtils {
    public static void main(String[] args) {
        try ( final Scanner scanner = new Scanner(System.in) ) {
            System.out.println("Insira o caminho de um arquivo!");
            String linhaComando = scanner.nextLine().replaceAll("\\\\","/");
            MeuReaderUtils readerUtils = new MeuReaderUtils();
            readerUtils.exibirConteudo(linhaComando);            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler/executar o comando!");
        }
    }
    public void exibirConteudo(String arquivo){
        if(arquivo.contains(".txt")){
            try (   
                final Reader reader = new FileReader(arquivo);
                final BufferedReader bufferReader = new BufferedReader(reader);
            ) {
                bufferReader.lines().forEach(System.out::println);
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
