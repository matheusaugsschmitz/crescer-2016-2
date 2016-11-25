/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crecer.aula2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 *
 * @author matheus.schmitz
 */
public class Execmplo2 {
    public static void main(String[] args) {
        try(
            final Reader reader = new FileReader("aula2.txt");
            final BufferedReader bufferReader = new BufferedReader(reader);
            ){
            
        }catch(Exception e){
            
        }
    }
}
