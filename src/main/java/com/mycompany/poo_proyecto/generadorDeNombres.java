/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Martinzte
 */
public class generadorDeNombres {
    public static void lista() throws FileNotFoundException, IOException {
        File Archivo=new File("Archivo.csv");
        if(!Archivo.exists()){
            Archivo.createNewFile();
        }
        FileWriter f1=new FileWriter(Archivo);
        for(int i=0;i<500;i++){
            Alumno a=generadorDatosPersonales.Datos();
            f1.write(a.toString()); 
        }
        f1.close();
    }
        
    
    public static void generarnombre() throws FileNotFoundException{
        
        String NombreCompleto=Nombre()+" "+Apellidos();
        
        System.out.println(NombreCompleto);
        
        
    }
    public static String Nombre() throws FileNotFoundException{
         File ListaDeNombres = new File("Nombres.txt");
         String Nombres="";
         int genero=(int)(Math.random()*4);//par para mujer, inpar para hombre
         if(genero%2==0){
             genero=0;
         }else{
             genero=1;
         }
         int number=0;
         if(genero==0){
             number=(int)(Math.random()*30+30);
         }else{
             number=(int)(Math.random()*29+1);
         }
         int cantidaDeNombres=(int)(Math.random()*2+1);
         int contador=0;
         if(cantidaDeNombres==1){
            Scanner File1 =new Scanner(ListaDeNombres);
            while (File1.hasNextLine()){
                String Nombre=File1.nextLine();                 
                if(contador==number){
                    contador=0;
                    Nombres=Nombre;
                }
                contador=contador+1;
            }
            File1.close();
        }else{
            String Nombre1="";
            String Nombre2="";
            int number2=0;
            if(genero==0){
                number2=(int)(Math.random()*30+30);          
            }else{
                number2=(int)(Math.random()*29+1);}
            if(number2==number){
                number2=number2+1;}
            Scanner File1 =new Scanner(ListaDeNombres);
            while (File1.hasNextLine()){
                String Nombre=File1.nextLine();
                if(contador==number){
                  Nombre1=Nombre;
                }
                if(contador==number2)
                  Nombre2=Nombre;
                contador=contador+1;
            }
            Nombres=Nombre1+" "+Nombre2;
            File1.close();
        }
       return Nombres;   
    }
    public static String Apellidos() throws FileNotFoundException{
        String Apellido1="";
        String Apellido2="";
        String Apellidos="";
        int contador=0;
        int number1=(int)(Math.random()*50+1);
        int number2=(int)(Math.random()*50+1);
        File ListaDeApellidos = new File("Apellidos.txt");
        Scanner File1 =new Scanner(ListaDeApellidos);
            while (File1.hasNextLine()){
                String Apellido=File1.nextLine();  
                if(contador==number1){
                  Apellido1=Apellido;
                }
                if(contador==number2){
                  Apellido2=Apellido;
                    //System.out.println(Apellido);
                }
                contador=contador+1;
            }
            Apellidos=Apellido1+" "+Apellido2;
            File1.close();
            return Apellidos;
    }
}
