/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author manuc
 */
public class Recetas {
    
    private String nombre;
    private String ingredientes;
    private String pasos;

    public Recetas(String nombre, String ingredientes, String pasos) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getIngredientes(){
        return ingredientes;
    }
    
    public String getPasos(){
        return pasos;
    }
}
