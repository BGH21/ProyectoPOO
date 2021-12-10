/*
 * Autores: Hernández D. 
 * Alumno
 * Versión 1.0
 * Fecha de creación: 2 de octubre de 2021
 * Ultima modificaación: 20 de octubre de 2021
 */
package com.mycompany.poo_proyecto;

public class Alumno {
    private String nombres;
    private String apellidos;
    private String correo;
    String direccion;
    private int edad;
    private int numeroDeCuenta;
    int semestre; 
    
    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String correo, String direccion, int edad, int numeroDeCuenta, int semestre) {
        this.nombres = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
        this.numeroDeCuenta = numeroDeCuenta;
        this.semestre = semestre;
        
    }
    
    public Alumno(String nombres, String apellidos, int edad, int semestre, String direccion, String correo, int numDeCuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.semestre = semestre;
        this.direccion = direccion;
        this.correo = correo;
        this.numeroDeCuenta = numDeCuenta;
    }
    
    public String getNombre() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

   
    @Override
    public String toString() {
        return nombres + "," + apellidos + "," + correo + "," + direccion+"," + edad + "," + numeroDeCuenta + "," 
                + semestre;
    }

}
