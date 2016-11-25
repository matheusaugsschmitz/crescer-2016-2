/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crecer.aula2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus.schmitz
 */
public class Exemplo1 {
    public static void main(String[] args){
        //instanciar arquivo para manipulação
        File file = new File("aula2.txt");
        //criar o arquivo ou não fazer nada se já existir
        try {
            boolean b = file.createNewFile();
            if(b){
                //exibir caminho completo do arquivo
                System.out.println(file.getAbsolutePath());
            }
        } catch (IOException ex) {
            
        }
    }
}
