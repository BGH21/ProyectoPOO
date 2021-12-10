package com.mycompany.poo_proyecto;



public class Grupo {
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
