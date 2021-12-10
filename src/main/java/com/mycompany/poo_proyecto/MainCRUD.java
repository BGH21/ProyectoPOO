/*
 * Autores: Hernández D. 
 * Alumno
 * Versión 1.0
 * Fecha de creación: 2 de octubre de 2021
 * Ultima modificaación: 22 de octubre de 2021
 */
package com.mycompany.poo_proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainCRUD {
    public static void main(String[] args) throws IOException {
        lista();
        Scanner entrada = new Scanner(System.in);
        int opU = 0, cuenta = 0;
        do{
            System.out.println("~~~ Bienvenido a servicios escolares ~~~");
            System.out.println("Elija el tipo de usario que está ingresando:"
                    + "\n 1) Alumno"
                    + "\n 2) Administrador"
                    + "\n 3) Salir");
            System.out.println("Opción: ");
            opU = Integer.parseInt(entrada.nextLine());
            switch (opU) {
                case 1:
                    System.out.println(" Alumno ");
                    System.out.println("Ingrese su número de cuenta:");
                    cuenta = Integer.parseInt(entrada.nextLine());
                    CRUD.menuAlumno(cuenta);      // opU = 1
                    break;
                case 2:
                    System.out.println(" Administrador ");
                    CRUD.menuAdministrador();     // opU = 2
                    break;
                case 3:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion  no válida");
                    break;
            }
        }while(opU!=3);
   }
   
     public static void lista() throws FileNotFoundException, IOException {
        
        File Archivo=new File("Archivo.csv");
        if(!Archivo.exists()){
            Archivo.createNewFile();
        }
        FileWriter f1=new FileWriter(Archivo);
        for(int i=0;i<500;i++){
        Alumno a=generadorDatosPersonales.Datos();
        f1.write(a.toString()+"\n"); 
            //System.out.println(a.toString()+"\n");
        //Historial H=Historial.metodo(a);       
        //int Num=Metodo(H);
        }
        
        f1.close();
        
    }
    
}
