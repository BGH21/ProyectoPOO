/*
 * Autores: Hernández D. 
 * Alumno
 * Versión 2.0
 * Fecha de creación: 2 de octubre de 2021
 * Ultima modificaación: 22 de octubre de 2021
 */
package com.mycompany.poo_proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MetodosCRUD {
    /*    Método que se encarga de leer el archivo, transformar las lineas a objetos d etipo alumno y regresar una 
    lista con los objetos par trabajar  */
    
    private static ArrayList<Alumno> abrir() throws FileNotFoundException, IOException{
        String line;  
        
        File file = new File("Archivo.csv");      
        FileReader fr = new FileReader(file);              // Abre arhivo para lectura 
        BufferedReader br =new BufferedReader(fr);
        
        ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();
        
        while((line=br.readLine())!=null){    // Mientras en el archivo no se encunetre una linea vacía
        //while((linea=br.readLine())!=null){    // Mientras en el archivo no se encunetre una linea vacía
            String[] parte = line.split(",");
            String nombre = parte[0];
            String aps = parte[1];
            String correo = parte[2];
            String dir = parte[3];
            int edad = Integer.parseInt(parte[4]);
            int numCuenta = Integer.parseInt(parte[5]);
            int sem = Integer.parseInt(parte[6]);
            
            Alumno alumno = new Alumno(nombre,aps,correo,dir,edad,numCuenta,sem) ;
            listaDeAlumnos.add(alumno);
        }
        br.close();     //Cierra los archivos
       
        return listaDeAlumnos;    
    }   
    
    /*
    1. El método abre el archivo para escritura 
    2. El programa registra los datos, osea le imprime al usuario ingresar, usa variables clase alumno: 
        -nombre (String), 
        -apellido1 (String), 
        -apellido2 (String), 
        -edad (int), 
        -dirección casa (String), 
        -semestre (int), 
        -materias (String), ingresa en el historial 
        -número de cuenta (int)
    3. El programa crea un objeto de tipo alumno
    4. Imprime el objeto en el archivo excel (el archivo puede o no estar ordenado)
    5. Cierra el documento
    */
    public static void create() throws IOException{
        try{       
            Scanner entrada = new Scanner(System.in);
            ArrayList<Alumno> listAlus = abrir();
            FileWriter fwf=new FileWriter("Archivo.csv",true);                 // Abre arhivo para escritura
            BufferedWriter bwf=new BufferedWriter(fwf);
            PrintWriter pwF=new PrintWriter(bwf);
            // Se ingresan los datos del alumno uno por uno
            System.out.println("--- Ingrese los datos del alumno --- ");
            System.out.println("Ingrese el nombre(s)del alumno:"); 
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido paterno del alumno:"); 
            String apPa = entrada.nextLine();
            System.out.println("Ingrese el apellido matero del alumno:"); 
            String apMa = entrada.nextLine();
            System.out.println("Ingrese el correo alumno:"); 
            String correo = entrada.nextLine();
            System.out.println("Ingrese la dirección del alumno:"); 
            String dir = entrada.nextLine();
            System.out.println("Ingrese la edad del alumno:"); 
            int edad = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese el número de cuenta del alumno:"); 
            int numCuenta = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese el semestre del alumno:"); 
            int sem = Integer.parseInt(entrada.nextLine());
    //      Alumno alumno = new Alumno(nombre,apPa+" "+apMa,correo,dir,edad,numCuenta,sem);
            Alumno alumno = new Alumno(nombre,apPa+" "+apMa,correo,dir,edad,numCuenta,sem);
            /*
            Aquí creoques e debe de hacer uso para el hitorial académico la función
            del Historial que yo no tengo y de ahi se obtiene el número de inscripción que yo tampoco tengo
            y con ello modificar el atributo mediante un setHistorial con una variabe y setNumeroInscripcion
            alumno.setHistorial(variable);
            alumno.setNumeroInscripcion(variable2);
            */
            
            System.out.println("Está seguro de querer registrar a este alumno con los datos ingresados?: 1) Si , 2) No");
            int seguro = Integer.parseInt(entrada.nextLine());
            switch(seguro){
                case 1:
                    listAlus.add(alumno);
                    pwF.println(alumno.toString());
                    
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            pwF.close();
        }catch(IOException ex){
         System.out.println(ex.getMessage());
        }
    }

    /* 1. El método llama a la función abrir que le regresa una lisat de alumnos, 
       2. Imprime los nombres en la consola.    */
    public static void read() throws IOException{
            
            ArrayList<Alumno> listAlus = abrir();
            System.out.println("--- Los alumnos registrados actualmete son:  --- ");
            for(int i = 0;i<listAlus.size();i++){
                System.out.println(listAlus.get(i));
            }
    }
    
    /*
    1. El método llama a la función abrir que le regresa una lista de alumnos
    2. Le solicita al usuario un alumno y lo busca mediante el métodod seEncuentra() 
    3. Obtiene al alumno a modificar o eliminar 
        3.1. Si elige modificar le da un submenú al usuario donde puede elegir los datos a modificar  
            3.1.1. guarda los cambios en variables.
        3.2. Si elige eliminar 
            3.2. remueve de la lista al alumno ee imprime los datos en el archivo
    4. En cada cambio de dato ingresado se le pregunta al usuario si está seguro de querer modificar el dato
            4.1 si responde si, usa el set del atributo, y lo cambia
            4.2 si responde no, sale del atributo. 
    5. Guarda el objeto en el archivo excel
    6. Cierra el documento
    */
    private static void modificar(int alu) throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        String nom=null, apP=null, apM=null;
        int op=0, seguro=0;    
        ArrayList<Alumno> listAlus = abrir();
        
        FileWriter fwf=new FileWriter("Archivo.csv");                 // Abre arhivo para escritura
        BufferedWriter bwf=new BufferedWriter(fwf);
        PrintWriter pwF=new PrintWriter(bwf);
        
        do{
            System.out.println("Elija el elemento que desea modificar del alumno"
                    + "\n1) Dirección"
                    + "\n2) Salir");
            System.out.println("Opción: ");
            op = Integer.parseInt(entrada.nextLine());
            switch(op){
                    case 1:
                        System.out.println("Eligió modificar dirección");
                        System.out.println("La dirección actual del alumno es: "+listAlus.get(alu).getDireccion());
                        System.out.println("Ingrese la nueva dirección del alumno: ");
                        String nDirec = entrada.nextLine();
                        System.out.println("Esta seguro de que desea cambiar la dirección del alumno de \n"+listAlus.get(alu).getDireccion()+" a \n"+nDirec);
                        System.out.println("1) Si , 2)No ");
                        seguro = Integer.parseInt(entrada.nextLine());
                        if(seguro==1){
                           
                        System.out.println("Actualizando...");
        for(int i =0;i<listAlus.size();i++){
            if(listAlus.get(i).getNumeroDeCuenta()==listAlus.get(alu).getNumeroDeCuenta()){
                listAlus.get(i).setDireccion(nDirec);
                System.out.println("Se actualizó la direccion a: "+listAlus.get(i).direccion);
                pwF.println(listAlus.get(i).toString());
            }else
            pwF.println(listAlus.get(i).toString());
        }
        pwF.close();}
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
        }while(op!=2);
        
    }
    
    public static void delete() throws FileNotFoundException, IOException{
        try{
            Scanner entrada = new Scanner(System.in);
            int op = 0, numCuenta = 0, seguro=0,posicion=-1;
            System.out.println("--- Buscar alumno a eliminar ---");
            System.out.println("¿Conoce el número de cuenta del alumno?: 1)Si , 2)No");   // 1)si , 2)No "
            int sabe = Integer.parseInt(entrada.nextLine());
            switch(sabe){
                case 1:
                    System.out.println("Ingrese el número de cuenta: ");
                    numCuenta = Integer.parseInt(entrada.nextLine());
                    posicion = seEncuentra(null, null, numCuenta,0);
                    if(posicion!=-1){
                        System.out.println("Está seguro de querer eliminar a este alumno? 1) Si , 2) No");
                        seguro = Integer.parseInt(entrada.nextLine());
                        if(seguro==1)
                            eliminar(posicion);
                    }break;
                case 2:    
                        System.out.println("Elija por que atributo quiere localizar al alumno: "
                                + "\n 1) Nombre(s)"
                                + "\n 2) Apellidos (Paterno y Materno)"
                                + "\n 3) Sair");
                        System.out.println("Opción: ");
                        op = Integer.parseInt(entrada.nextLine());
                        switch (op) {
                            case 1:
                                System.out.println("Ingrese el nombre del alumno: ");
                                String nom = entrada.nextLine();
                                posicion = seEncuentra(nom,null,0,0);
                                if(posicion!=-1){
                                    System.out.println("Está seguro de querer eliminar a este alumno? 1) Si , 2) No");
                                    seguro = Integer.parseInt(entrada.nextLine());
                                    if(seguro==1)
                                        eliminar(posicion);
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese el apellido paterno del alumno: ");
                                String apP = entrada.nextLine();
                                System.out.println("Ingrese el apellido materno del alumno: ");
                                String apM = entrada.nextLine();
                                posicion = seEncuentra(null,apP+" "+apM,0,0);
                                if(posicion!=-1){
                                    System.out.println("Está seguro de querer eliminar a este alumno? 1) Si , 2) No");
                                    seguro = Integer.parseInt(entrada.nextLine());
                                    if(seguro==1)
                                        eliminar(posicion);
                                }
                                break;
                            case 3: 
                                break;
                            default:
                                break;
                        }
                    break;
                default:
                    System.out.println("opción nó valida");
                    break;
            }
        }catch(IOException ex){
        System.out.println(ex.getMessage());
        }
    }
    public static void update() throws FileNotFoundException, IOException{
        try{
            Scanner entrada = new Scanner(System.in);
            int op = 0, numCuenta = 0, seguro=0, posicion=-1;
            
            System.out.println("--- Buscar alumno a actualizar ---");
            System.out.println("¿Conoce el número de cuenta del alumno?: 1)Si , 2)No");   // 1)si , 2)No "
            int sabe = Integer.parseInt(entrada.nextLine());
            switch(sabe){
                case 1:
                    System.out.println("Ingrese el número de cuenta: ");
                    numCuenta = Integer.parseInt(entrada.nextLine());
                    posicion = seEncuentra(null, null, numCuenta,0);
                    if(posicion!=-1){
                        System.out.println("Está seguro de querer modifcar a este alumno? 1) Si , 2) No");
                        seguro = Integer.parseInt(entrada.nextLine());
                        if(seguro==1)
                            modificar(posicion);
                    }
                    break;
                case 2:    
                       read();
                       update();
                default:
                    System.out.println("opción nó valida");
                    break;
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
            public static void modificarA(int cuenta) throws FileNotFoundException, IOException{
               Scanner entrada = new Scanner(System.in);
               int posAlu = seEncuentra(null,null, cuenta, 1);
               int op=0, seguro=0;    
               ArrayList<Alumno> listAlus = abrir();
               FileWriter fwf=new FileWriter("Archivo.csv");                 // Abre arhivo para escritura
               BufferedWriter bwf=new BufferedWriter(fwf);
               PrintWriter pwF=new PrintWriter(bwf);
               do{
                   System.out.println("Elija el elemento que desea hacer"
                           + "\n1) Correo" + "\n2) Otro"+ "\n3) Salir\"");
                   System.out.println("Opción: ");
                   op = Integer.parseInt(entrada.nextLine());
                   switch(op){
                           case 1:
                        System.out.println("Eligió modificar correo");
                        System.out.println("El correo actual registrado es: "+listAlus.get(posAlu).getCorreo());
                        System.out.println("Ingrese la nueva dirección de correo: ");
                        String nCorreo = entrada.nextLine();
                        System.out.println("Esta seguro de que desea cambiar su dirección de correo de "+listAlus.get(posAlu).getCorreo()+" a "+nCorreo);
                        System.out.println("1) Si , 2)No ");
                        seguro = Integer.parseInt(entrada.nextLine());
                        if(seguro==1){
                            listAlus.get(posAlu).setCorreo(nCorreo);
                            System.out.println("Datos nuevos:\n"+listAlus.get(posAlu).toString());
                            for(int i =0;i<listAlus.size();i++){
                                pwF.println(listAlus.get(i));
                            }
                        pwF.close();
                        }
                        break;
                    case 2:
                        System.out.println("Para modificar algún otro dato referente a sus datos personales"
                            + "\nsolicite la modificación directamente a servicios escolares asegurese de tener su direcccion de correo correcta por que ese sera el medio de comunicacion");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
        }while(op!=3);
        
        
    }

    private static void eliminar(int posAlu) throws FileNotFoundException, IOException{
        ArrayList<Alumno> listAlus = abrir();
        
        FileWriter fwf=new FileWriter("Archivo.csv");//Abre arhivo para escritura
        BufferedWriter bwf=new BufferedWriter(fwf);
        PrintWriter pwF=new PrintWriter(bwf);
        
        listAlus.remove(posAlu);
        for(int i =0;i<listAlus.size();i++){
            pwF.println(listAlus.get(i));
        }
        pwF.close();
        System.out.println("Se elimino el alumno");
    }
        
    public static int seEncuentra(String nombre, String aPs, int numCuenta, int aux) throws FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        boolean esta = false;
        int cont = 0, encontre=0, conocer=0, pos= -1;
        Alumno alumno =null; 
        ArrayList<Alumno> listAlus = abrir();
        if(numCuenta!=0){
            for (int i=0;i<listAlus.size();i++) {
            //busca un alumno por número de cuenta
                if (listAlus.get(i).getNumeroDeCuenta()== numCuenta){
                    esta=true;
                    alumno = listAlus.get(i);
                    System.out.println("Los datos que corresponden a este número de cuenta son:");
                    System.out.println("  Nombre: "+listAlus.get(i).getNombre()+" "+listAlus.get(i).getApellidos()
                            + "\n  Numero De Cuenta: " + listAlus.get(i).getNumeroDeCuenta()
                            + "\n  Correo: " + listAlus.get(i).getCorreo()
                            + "\n  Direccion: " + listAlus.get(i).getDireccion()
                            + "\n  Edad: " + listAlus.get(i).getEdad() + " años"+ "\t\tSemestre: " + listAlus.get(i).getSemestre());
                    System.out.println(" Desea conocer el número de inscripción e historial académico? 1) Si , 2) No");
                    conocer = Integer.parseInt(entrada.nextLine());
                    if(conocer == 1){
                        HistorialA H=new HistorialA(listAlus.get(i));
                System.out.println(H);
                System.out.println(H.numdeins(listAlus.get(i)));
                    }
                    if(aux==1)
                        System.out.println("Si algún dato es erroneo, póngase en contacto con la admnistración");
                    return i;
                }
            }
        }else{
            System.out.println("---Lista de conincidencias ---");
            System.out.println("Numero De Cuenta:\t-\tNombre:\t\tApellido Paterno:\t\tApellido Materno:\t-\tEdad:\t-\tCorreo:\t-\tDirección:\t\tSemestre:");
            if(nombre!=null){
                for (int i=0;i<listAlus.size();i++) {
                    if (listAlus.get(i).getNombre()== nombre){
                        esta=true;
                        cont++;
                        System.out.println(listAlus.get(i).getNumeroDeCuenta()+"\t\t"+listAlus.get(i).getNombre()+"\t\t"+listAlus.get(i).getApellidos()+"\t-\t"+listAlus.get(i).getEdad()+"\t\t"+listAlus.get(i).getCorreo()+"\t\t"+listAlus.get(i).getDireccion()+"\t\t"+listAlus.get(i).getDireccion());
                    }
                }
            }
            if(aPs!=null){
                for (int i=0;i<listAlus.size();i++) {
                    if ((listAlus.get(i).getApellidos()== aPs)){
                        esta=true;
                        System.out.println(listAlus.get(i).getNumeroDeCuenta()+"\t\t"+listAlus.get(i).getNombre()+"\t\t"+listAlus.get(i).getApellidos()+"\t-\t"+listAlus.get(i).getEdad()+"\t\t"+listAlus.get(i).getCorreo()+"\t\t"+listAlus.get(i).getDireccion()+"\t\t"+listAlus.get(i).getDireccion());
                    }
                }
            }
            if(cont!=0){
                System.out.println("El alumno que busca se encuentra en la llista dada? 1) Si , 2) No");
                encontre = Integer.parseInt(entrada.nextLine());
                if(encontre==1){
                    System.out.println("Ingrese el número de cuenta del alumno:");
                    numCuenta = Integer.parseInt(entrada.nextLine());
                    seEncuentra(null, null, numCuenta, 0);
                }
            }else{
                    System.out.println("No se encontró ninguna coincidencia");
            }
        }
        if(esta!= true){
            System.out.println("El elemento ingresado no corresponde a ningún alumno");
        }
        return pos;
    }    
}
