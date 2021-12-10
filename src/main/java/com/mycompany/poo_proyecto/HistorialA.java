/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_proyecto;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @Belen Gaytan Herrera
 */
public class HistorialA {
     public Alumno al;

     public HistorialA() {
    }

    public HistorialA(Alumno al) {
        this.al = al;
    }
    public double numdeins(Alumno al){
        class Grupo {
            private String idGrupo;
            private String nombreGrupo;
            private int creditos;
            private int calificacion;


            public Grupo(){}

            public Grupo(String idGrupo,String nombreGrupo, int creditos, int calificacion){
                this.idGrupo=idGrupo;
                this.nombreGrupo=nombreGrupo;
                this.creditos=creditos;
                this.calificacion=calificacion;
            }

            public String getIdGrupo() {
                return idGrupo;
            }

            public void setIdGrupo(String idGrupo) {
                this.idGrupo = idGrupo;
            }

            public String getNombreGrupo() {
                return nombreGrupo;
            }

            public void setNombreGrupo(String nombreGrupo) {
                this.nombreGrupo = nombreGrupo;
            }
            public int getCreditos() {
                return creditos;
            }

            public void setCreditos(int creditos) {
                this.creditos = creditos;
            }
            public int getCalificacion() {
                return calificacion;
            }

            public void setCalificacion(int calificacion) {
                this.calificacion = calificacion;
            }
        }
        Grupo[] clases;
        clases = new Grupo[47];
        clases[0] = new Grupo("1120","Álgebra", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[1] = new Grupo("1121","Cálculo y Geometría Analítica", 12, ThreadLocalRandom.current().nextInt(6, 10));
        clases[2] = new Grupo("1123","Química", 10,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[3] = new Grupo("1130","Fundamentos de Física", 6,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[4] = new Grupo("1122","Fundamentos de Programación", 10,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[5] = new Grupo("1220","Álgebra Lineal", 8,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[6] = new Grupo("1221","Cálculo Integral", 8,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[7] = new Grupo("1228","Mecánica", 12,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[8] = new Grupo("1124","Redacción y Exposición de Temas de Ingeniería", 6,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[9] = new Grupo("1227","Estructura de Datos y Algoritmos I", 10,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[10] = new Grupo("1436","Probabilidad", 8,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[11] = new Grupo("1321","Cálculo Vectorial", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[12] = new Grupo("1325","Ecuaciones Diferenciales", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[13] = new Grupo("1222","Cultura y Comunicación", 2, ThreadLocalRandom.current().nextInt(6, 10));
        clases[14] = new Grupo("1317","Estructura de Datos y Algoritmos II", 10, ThreadLocalRandom.current().nextInt(6, 10));
        clases[15] = new Grupo("1323","Programación Orientada a Objetos", 10,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[16] = new Grupo("1436","Fundamentos de Estadística", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[17] = new Grupo("1321","Eléctricidad y Magnetismo", 10,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[18] = new Grupo("1325","Análisis Numérico", 8,  ThreadLocalRandom.current().nextInt(6, 10));
        clases[19] = new Grupo("1424","Matemáticas Avanzadas", 8,ThreadLocalRandom.current().nextInt(6, 10));
        clases[20] = new Grupo("0119","Estructuras Discretas", 8,ThreadLocalRandom.current().nextInt(6, 10));
        clases[21] = new Grupo("1503","Estructura y Programación de Computadoras", 8,ThreadLocalRandom.current().nextInt(6, 10));
        clases[22] = new Grupo("0138","Dispositivos Eléctronicos", 10,ThreadLocalRandom.current().nextInt(6, 10));
        clases[23] = new Grupo("0442","Lenguajes Formales y Autómatas", 8,ThreadLocalRandom.current().nextInt(6, 10));
        clases[24] = new Grupo("1473","Señales Y Sistemas", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[25] = new Grupo("1531","Ingeniería de Software", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[26] = new Grupo("0840","Sistemas Operativos", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[27] = new Grupo("1645","Diseño Digital Moderno", 10, ThreadLocalRandom.current().nextInt(6, 10));
        clases[28] = new Grupo("1644","Bases de Datos", 14, ThreadLocalRandom.current().nextInt(6, 10));
        clases[29] = new Grupo("1562","Circuitos Eléctricos", 8,ThreadLocalRandom.current().nextInt(6, 10));
        clases[30] = new Grupo("1643","Administración de Proyectos de Software", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[31] = new Grupo("1537","Finanzas en la Ingeniería en Computación", 6,ThreadLocalRandom.current().nextInt(6, 10));
        clases[32] = new Grupo("1535","Diseño Digital VLSI", 8,ThreadLocalRandom.current().nextInt(6, 10));
        clases[33] = new Grupo("0406","Inteligencia Artificial", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[34] = new Grupo("0434","Compiladores", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[35] = new Grupo("1686","Sistemas de Comunicaciones", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[36] = new Grupo("1413","Introducción a la Economía", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[37] = new Grupo("1672","Microcomputadoras", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[38] = new Grupo("1590","Computación Gráfica e Interacción Humano-Computadora", 10, ThreadLocalRandom.current().nextInt(6, 10));
        clases[40] = new Grupo("1052","Ética Profesional", 6, ThreadLocalRandom.current().nextInt(6, 10));
        clases[41] = new Grupo("1598","Redes de Datos Seguras", 14, ThreadLocalRandom.current().nextInt(6, 10));
        clases[42] = new Grupo("1867","Organización y Arquitectura de Computadoras", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[43] = new Grupo("1858","Fundamentos de Sistemas Embebidos", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[44] = new Grupo("1959","Sistemas Distribuidos", 8, ThreadLocalRandom.current().nextInt(6, 10));
        clases[45] = new Grupo("2080","Recursos y Necesidades de México", 8, ThreadLocalRandom.current().nextInt(6, 10));

        class random{
            public int rand(){
                int x = ThreadLocalRandom.current().nextInt(5, 46);
                return x;
            }
        }
        random r=new random();
        List<Grupo> lstGrupo= new ArrayList<Grupo>();

        Set<Grupo> s = new LinkedHashSet(lstGrupo);
        s.add(clases[0]);
        s.add(clases[1]);
        s.add(clases[2]);
        s.add(clases[3]);
        s.add(clases[4]);
        for (int i = 5; i<= r.rand(); i++) {
            s.add(clases[r.rand()]);
        }
        s.remove(null);

        Grupo[] strArr = new Grupo[s.size()];
        s.toArray(strArr);

        int counter = 0;
        for (int i = 0; i<strArr.length; i++ ){
            counter = counter + strArr[i].getCreditos();
        }

        class prome{
            public  float prom(Grupo[] al){
                float r = 0, op = 0;
                for (int i = 0; i<al.length; i++ ){
                    r= r + al[i].getCalificacion();
                }
                op=(r/ al.length);
                return op;
            }
        }
        int credsupuestos=0;
        if (al.semestre == 1){
           credsupuestos = 0;
        }
        if (al.semestre == 2){
            credsupuestos = 46;
        }
        if (al.semestre == 3){
            credsupuestos = 90;
        }
        if (al.semestre == 4){
            credsupuestos = 136;
        }
        if (al.semestre == 5){
            credsupuestos = 178;
        }
        if (al.semestre == 6){
            credsupuestos = 220;
        }
        if (al.semestre == 7){
            credsupuestos = 268;
        }
        if (al.semestre == 314){

        }
        if (al.semestre == 9){
            credsupuestos = 352;
        }
        if (al.semestre == 10){
            credsupuestos = 384;
        }
        int creditos = counter;

        class velocidad{
            public double creding(Alumno al, int cred, int credsp){
                double res;
                res = (((float)cred/ (float)credsp)*0.01);
                return res;
            }
        }
        prome p=new prome();
        float promedio = p.prom(strArr);
        int sem = al.semestre;
        velocidad v=new velocidad();
        double vel = v.creding(al, counter, credsupuestos);
        double resultado = (promedio)*(vel);
        System.out.println(al.getNombre()+" "+al.getApellidos()+" "+al.getSemestre());
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i<strArr.length; i++){
            System.out.println("Materia: " + strArr[i].idGrupo +"-" + strArr[i].nombreGrupo + " Créditos:" 
                    + strArr[i].creditos + "  " + "  Calificación: "+ strArr[i].calificacion);
        }
        System.out.println("-----------------------------------------------------");
        return resultado;
    }
    
}
