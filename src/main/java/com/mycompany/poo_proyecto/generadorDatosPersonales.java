/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * 
 */
public class generadorDatosPersonales {
    public static Alumno Datos() throws FileNotFoundException{
        String Nombres=generadorDeNombres.Nombre();
        String Apellidos=generadorDeNombres.Apellidos();
        String correo=Correo(Nombres,Apellidos);
        int edad=(int)(Math.random()*9+18);
        int Semestre=(int)(Math.random()*restriccion(edad)+1);
        int Cuenta=(int)(Math.random()*999999999+299999999);
        //HistorialA H=Metodo(Nombres,Apellidos,Semestre,Cuenta);       
        String Direccion=Direccion();      
        Alumno Alu=new Alumno(Nombres,Apellidos,edad,
                Semestre,Direccion,correo,Cuenta);
        return Alu;
    }
    private static String Correo(String Nombre,String Apellido){
        String[] nombre=Nombre.split(" ");
        String[] apellido=Apellido.split(" ");
       String Correo=nombre[0]+"."+apellido[0]+apellido[1].charAt(0)
                                                +"@ingenieria.unam.edu";
        return Correo;
    }

    private static int restriccion(int edad) {
        int restriccion=(edad-18)*2+4;//el 4 se puede cambiar por 3
        if(restriccion>10)
            restriccion=10;
        
        return restriccion;
    }
    private static String Direccion() throws FileNotFoundException{
        int contador=0;
        int number=(int)(Math.random()*500+1);
        File Direcciones = new File("Direcciones.txt");
        Scanner File1 =new Scanner(Direcciones);
            while (File1.hasNextLine()){
                String Dir=File1.nextLine();
                 
                if(contador==number){
                  return Dir;
                }
                contador=contador+1;
            }
            File1.close();
            return "no disponible"; 
    }
}
