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
import java.io.IOException;
import java.util.Scanner;

public class CRUD {
    public static void menuAlumno(int cuenta) throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
             if(MetodosCRUD.seEncuentra(null, null, cuenta, 0)!=-1){            
        int op = 0;
        do{
            System.out.println("~~~ Módulo CRUD ~~~");
            System.out.println(" 1) Leer datos personales"
                    + "\n 2) Actualizar datos"
                    + "\n 3) Salir");
            System.out.println("Elija la opción que desea realizar: ");
            op = Integer.parseInt(entrada.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Elgió Leer datos personales");
                    MetodosCRUD.seEncuentra(null, null, cuenta, 1);
                    break;
                case 2:
                    System.out.println("Elgió Actualizar datos");
                    MetodosCRUD.modificarA(cuenta);
                    break;
                case 3:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=3);}else
                 System.out.println("No se encuentra la cuenta");
    }
    
    public static void menuAdministrador() throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        int op=0; 
        do{
            System.out.println("~~~ Módulo CRUD ~~~");
            System.out.println(" 1) Crear/ Registrar nuevo alumno" + "\n 2) Leer archivo de alumnos"
                    + "\n 3) Actualizar registros" + "\n 4) Eliminar alumno" + "\n 5) Salir");
            System.out.println("Elija la opción que desea realizar: ");
            op = Integer.parseInt(entrada.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Elgió Crear nuevo alumno");
                    MetodosCRUD.create();
                    break;
                case 2:
                    System.out.println("Elgió Leer archivo de alumnos");
                    MetodosCRUD.read();
                    break;
                case 3:
                    System.out.println("Elgió Actualizar registros");
                    MetodosCRUD.update();
                    break;
                case 4:
                    System.out.println("Elgió Eliminar alumno");
                    MetodosCRUD.delete();
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(op!=5);
       
   }
}
