/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author cristian
 */
public class alumno {
   
  public String nom,ape;
    private int id;

    public alumno(int id, String nom, String ape) {
        this.id=id;
        this.nom=nom;
        this.ape=ape;
    }
    
    public void imprimir(){
        System.out.println("ID: "+id+" Nombre: "+nom+" Apellido: "+ape);
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
   
   
}
